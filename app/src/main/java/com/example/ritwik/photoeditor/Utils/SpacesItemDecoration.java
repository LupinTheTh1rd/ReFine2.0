package com.example.ritwik.photoeditor.Utils;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.concurrent.RecursiveAction;

/**
 * Created by ritwik on 17-03-2019.
 */

public class SpacesItemDecoration extends RecyclerView.ItemDecoration{
    private int space;

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
//        super.getItemOffsets(outRect, itemPosition, parent);
        if(parent.getChildAdapterPosition(view) == state.getItemCount()-1) {
            outRect.left = space;
            outRect.right = 0;
        }else {
            outRect.left = 0;
            outRect.right = space;
        }
    }

    public SpacesItemDecoration(int space) {
        this.space = space;
    }
}
