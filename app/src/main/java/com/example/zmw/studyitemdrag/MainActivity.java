package com.example.zmw.studyitemdrag;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.zmw.studyitemdrag.module.MainActivityHelper;
import com.example.zmw.studyitemdrag.touch.SimpleItemTouchHelperCallback;
import com.example.zmw.studyitemdrag.touch.ZMWItemTouchHelper;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.recyclerview)
    RecyclerView recyclerView;


    MainActivityHelper mainActivityHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mainActivityHelper=new MainActivityHelper(MainActivity.this,recyclerView);
        mainActivityHelper.init();
    }

    private void initDrag(){
        recyclerView.getDrawingCache();
    }

}
