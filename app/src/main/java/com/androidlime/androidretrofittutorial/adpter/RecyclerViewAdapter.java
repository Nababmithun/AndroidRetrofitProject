package com.androidlime.androidretrofittutorial.adpter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidlime.androidretrofittutorial.Activity.MainActivity;
import com.androidlime.androidretrofittutorial.R;
import com.androidlime.androidretrofittutorial.Viewholder.recyclerviewholder;

import java.util.List;

/**
 * Created by Mithun on 7/26/2019.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter <recyclerviewholder>   {

   private List<MainActivity> item;

    public  RecyclerViewAdapter (List<MainActivity>list)
    {
        this.item=list;
    }

    @Override
    public recyclerviewholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutview= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_row,null);

        recyclerviewholder recycler=new recyclerviewholder(layoutview);

        return recycler;
    }

    @Override
    public void onBindViewHolder(recyclerviewholder holder, int position) {

         holder.nam.setText(item.get(position).getText(getItemCount()
         ));
         holder.varsity.setText(item.get(position).getText(getItemCount()));




    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
