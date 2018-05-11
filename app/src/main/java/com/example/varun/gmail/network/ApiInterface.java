package com.example.varun.gmail.network;

import com.example.varun.gmail.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by varun on 11-05-2018.
 */

public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
