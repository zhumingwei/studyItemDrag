package com.example.zmw.studyitemdrag.touch;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by ZMW on 2016/5/6.
 */
public class ZMWItemTouchHelper2 extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {
    //上方向
    public static final int UP = 1;
    //下方向
    public static final int DOWN = 1 << 1;
    //左方向
    public static final int LEFT = 1 << 2;
    //右方向
    public static final int RIGHT = 1 << 3;

    //不知道干什么用的，和方向有关
    public static final int START = LEFT << 2;
    public static final int END = RIGHT << 2;

    //ACTION状态
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    public static final int ACTION_STATE_DRAG = 2;

    //动画状态
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 1 << 1;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 1 << 2;
    public static final int ANIMATION_TYPE_DRAG = 1 << 3;

    private static final String TAG = "ZMWTouchHelperCallback";

    private static final int ACTIVE_POINTER_ID_NONE = -1;

    private static final int DIRECTION_FLAG_COUNT = 8;

    private static final int ACTION_MODE_IDLE_MASK = (1 << DIRECTION_FLAG_COUNT) - 1;

    private static final int ACTION_MODE_SWIPE_MASK = ACTION_MODE_IDLE_MASK << DIRECTION_FLAG_COUNT;

    private static final int ACTION_MODE_DRAG_MASK = ACTION_MODE_SWIPE_MASK << DIRECTION_FLAG_COUNT;


    @Override
    public void onChildViewAttachedToWindow(View view) {

    }

    @Override
    public void onChildViewDetachedFromWindow(View view) {

    }
}
