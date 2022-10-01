package com.example.newdemo.Api;

import com.example.newdemo.Model.ResponseModel;

import java.util.Collection;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices
{
   @GET("unknown")
    Call<ResponseModel>getData();
}
