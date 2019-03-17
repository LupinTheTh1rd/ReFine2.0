package com.example.ritwik.photoeditor.Utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

import java.lang.reflect.Field;

/**
 * Created by ritwik on 17-03-2019.
 */

public class NonSwipeableViewPager extends ViewPager {

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
//        return super.onTouchEvent(ev);
        return false;       //again, no response on touch
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        return super.onInterceptTouchEvent(ev);
        return false;       //replacing it by false, so that no response on swipe
    }

    public NonSwipeableViewPager(@NonNull Context context) {
        super(context);
        setMyScroller();
    }

    private void setMyScroller() {
        try{
           Class<?> viewpager = ViewPager.class;
           Field scroller = viewpager.getDeclaredField("mScroller");
           scroller.setAccessible(true);
           scroller.set(this,new MyScroller(getContext()));
        }
        catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public NonSwipeableViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context);
        setMyScroller();
    }

    private class MyScroller extends Scroller {
        @Override
        public void startScroll(int startX, int startY, int dx, int dy, int duration) {
            super.startScroll(startX, startY, dx, dy, 400);
        }

        public MyScroller(Context context) {
            super(context, new DecelerateInterpolator());
        }
    }
}
