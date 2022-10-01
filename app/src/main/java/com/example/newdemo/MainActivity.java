 package com.example.newdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.newdemo.Api.ApiServices;
import com.example.newdemo.Api.RetrofitClient;

import com.example.newdemo.Model.ResponseModel;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

 public class MainActivity extends AppCompatActivity {
TextView txt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textView);
        txt.setText("");
        ApiServices api =  new RetrofitClient().getRetrofit().create(ApiServices.class);
        Call<ResponseModel>call = api.getData();
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                ResponseModel responseModel = response.body();
                txt.append("page: "+responseModel.getPage()+
                        "\nper_page: "+responseModel.getPer_page()
                +"\ntotal: "+responseModel.getTotal()
                +"\ntotal_pages: "+responseModel.getTotal_pages()+"\n\n");
                assert responseModel != null;
                List<ResponseModel.DataResponse>dataResponses = responseModel.data;
                //ResponseModel.SupportResponse supportResponse = responseModel.supportResponse;
                for (int i=0;i<dataResponses.size();i++)
                {
                    txt.append("id"+dataResponses.get(i).getId()
                            +"\nname: "+dataResponses.get(i).getName()
                    +"\nemail: "+dataResponses.get(i).getEmail()
                    +"\ncolor:"+dataResponses.get(i).getColor()+"\n\n"

                    );
                }

            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

            }
        });

    }
}