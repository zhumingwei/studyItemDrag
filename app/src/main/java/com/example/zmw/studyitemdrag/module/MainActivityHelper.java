package com.example.zmw.studyitemdrag.module;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.zmw.studyitemdrag.Constant;
import com.example.zmw.studyitemdrag.MainActivity;
import com.example.zmw.studyitemdrag.adapter.AdapterBookList;
import com.example.zmw.studyitemdrag.bean.BookTable;
import com.example.zmw.studyitemdrag.touch.OnStartDragListener;
import com.example.zmw.studyitemdrag.touch.SimpleItemTouchHelperCallback;
import com.example.zmw.studyitemdrag.touch.ZMWItemTouchHelper;
import com.example.zmw.studyitemdrag.util.LogUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by ZMW on 2016/5/6.
 */
public class MainActivityHelper implements OnStartDragListener {
    MainActivity mainActivity;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    AdapterBookList adapterBookList;
    //拖拽帮助类
    private ZMWItemTouchHelper mItemTouchHelper;
    public MainActivityHelper(MainActivity mainActivity, RecyclerView recyclerView) {
        this.mainActivity = mainActivity;
        this.recyclerView = recyclerView;
    }

    public void init() {
        layoutManager = new GridLayoutManager(mainActivity, 3);
        recyclerView.setLayoutManager(layoutManager);
        initData();
        adapterBookList.setDragListener(this);
        ZMWItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapterBookList);
        mItemTouchHelper=new ZMWItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(recyclerView);
    }

    private void initData() {
        Type type = new TypeToken<List<BookTable>>() {
        }.getType();

        List<BookTable> list = new Gson().fromJson(Constant.bookdata, type);
        adapterBookList = new AdapterBookList(mainActivity, list);
        recyclerView.setAdapter(adapterBookList);
    }


    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder) {
        LogUtils.debug("startdrag");
        mItemTouchHelper.startDrag(viewHolder);
    }

}
