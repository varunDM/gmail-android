package com.example.varun.gmail.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.varun.gmail.R;
import com.example.varun.gmail.model.Message;

import java.util.List;

/**
 * Created by varun on 11-05-2018.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MyViewHolder> {

    private Context mContext;
    private List<Message> messages;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView from,subject,message,iconText,timestamp;
        public ImageView iconImp,imageProfile;

        public MyViewHolder(View view) {
            super(view);
            from = (TextView) view.findViewById(R.id.from);
            subject = (TextView) view.findViewById(R.id.txt_primary);
            message = (TextView) view.findViewById(R.id.txt_secondary);


        }
    }

    public MessageAdapter(Context context, List<Message> messages) {
        this.mContext = context;
        this.messages = messages;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.message_list_row,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Message message = messages.get(position);

        holder.from.setText(message.getFrom());
        holder.subject.setText(message.getSubject());
        holder.message.setText(message.getMessage());


    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
