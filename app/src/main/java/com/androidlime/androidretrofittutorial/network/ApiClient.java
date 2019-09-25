package com.androidlime.androidretrofittutorial.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mithun on 7/29/2019.
 */

public class ApiClient {


    public  static  final String BASE_URL="https://api.myjson.com/bins/ja3al/";


    private  static Retrofit retrofit=null;

    public  static  Retrofit getclient()
    {

       if(retrofit==null)
       {

          retrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();




       }
        return  retrofit;

    }


}
