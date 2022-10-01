package com.example.newdemo.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient
{
  public String baseUrl = "https://reqres.in/api/";
  public Retrofit retrofit;
  public Retrofit getRetrofit()
  {
      if (retrofit==null)
      {
          retrofit = new Retrofit.Builder()
                  .baseUrl(baseUrl)
                  .addConverterFactory(GsonConverterFactory.create())
                  .build();
      }
    return retrofit;
  }
}
