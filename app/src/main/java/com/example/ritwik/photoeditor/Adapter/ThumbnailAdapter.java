package com.example.ritwik.photoeditor.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ritwik on 17-03-2019.
 */

public class ThumbnailAdapter extends RecyclerView.Adapter<ThumbnailAdapter.MyViewHolder> {

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView thumbnail;
        TextView filter_name;
        public MyViewHolder(View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.thumbnail);
            filter_name = itemView.findViewById(R.id.filter_name);
        }

    }
}
