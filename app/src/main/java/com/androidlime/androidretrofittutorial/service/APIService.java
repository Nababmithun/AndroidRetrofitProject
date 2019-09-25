package com.androidlime.androidretrofittutorial.service;

import com.androidlime.androidretrofittutorial.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Mithun on 7/31/2019.
 */

public interface APIService {


    @GET("JSON_Bangla")
    Call<List<User>> getuserData();


}
