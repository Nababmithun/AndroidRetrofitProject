package com.androidlime.androidretrofittutorial.Activity;

import android.app.Service;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.androidlime.androidretrofittutorial.R;
import com.androidlime.androidretrofittutorial.adpter.RecyclerViewAdapter;
import com.androidlime.androidretrofittutorial.model.User;
import com.androidlime.androidretrofittutorial.network.ApiClient;
import com.androidlime.androidretrofittutorial.service.APIService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    private LinearLayoutManager layoutmanager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         getUserlist();



        }

    private void getUserlist() {


        try {

            APIService service=ApiClient.getclient().create(APIService.class);
            Call<List<User>>call= service.getuserData();

            call.enqueue(new Callback<List<User>>() {
                @Override
                public void onResponse(Call<List<User>> call, Response<List<User>> response) {

                     //long.d("onRwsponse",response.message());

                    List<User> userlist=response.body();


                    layoutmanager=new LinearLayoutManager(MainActivity.this);


                    RecyclerView recyclerview= (RecyclerView) findViewById(R.id.recycler);

                    recyclerview.setLayoutManager(layoutmanager);
                    RecyclerViewAdapter recyclerviewAdapter=new RecyclerViewAdapter(userlist);
                    recyclerviewAdapter.getItemCount();



                }

                @Override
                public void onFailure(Call<List<User>> call, Throwable t) {

                }
            });

        }catch (Exception e)
        {




        }



    }


}

