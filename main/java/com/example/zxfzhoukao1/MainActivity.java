package com.example.zxfzhoukao1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.zxfzhoukao1.bean.MyData;
import com.example.zxfzhoukao1.dapter.MyAdapter;
import com.example.zxfzhoukao1.mvp.pp.PerenterImpl;
import com.example.zxfzhoukao1.mvp.vieww.IView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IView {
    private String url = "http://www.zhaoapi.cn/product/getCatagory?page=";
    private RecyclerView recyview;
    private ArrayList<MyData.DataBean> list = new ArrayList<>();
    private ArrayList<MyData.DataBean> list1 = new ArrayList<>();
    private PerenterImpl perenter;

    private GridLayoutManager manager;
    private MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        perenter = new PerenterImpl(this);
        perenter.startRequest(url);
        adapter = new MyAdapter(list, this);
        recyview.setAdapter(adapter);
        manager = new GridLayoutManager(this, 3);
        recyview.setLayoutManager(manager);
    }

    private void initView() {
        recyview = (RecyclerView) findViewById(R.id.recyview);
    }

    @Override
    public void setCheng(MyData myData) {
        list.addAll(myData.getData());
        adapter.notifyDataSetChanged();
    }

    @Override
    public void setBai(String error) {

    }

}
