package com.androidlime.androidretrofittutorial.Viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.androidlime.androidretrofittutorial.R;

/**
 * Created by Mithun on 7/26/2019.
 */

public class recyclerviewholder  extends RecyclerView.ViewHolder  implements View.OnClickListener{

      public   TextView nam,varsity;

    public recyclerviewholder(View itemView) {
        super(itemView);


        itemView.setOnClickListener(this);


        nam.findViewById(R.id.name);
        varsity.findViewById(R.id.university);
    }

    @Override
    public void onClick(View v) {

    }
}
