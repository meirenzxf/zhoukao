package com.example.zxfzhoukao1.dapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.zxfzhoukao1.R;
import com.example.zxfzhoukao1.bean.MyData;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<MyData.DataBean> list;
    private Context context;
    private ImageView imageView1;

    public MyAdapter(ArrayList<MyData.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view =LayoutInflater.from(context).inflate(R.layout.item_a,null);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder viewHolder, int i) {

        MyData.DataBean dataBean=list.get(i);
        Glide.with(context).load(dataBean.getIcon()).into(imageView1);
        viewHolder.textView1.setText(dataBean.getName());
       // viewHolder.textView2.setText(dataBean.getCid());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView1;
        private TextView textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1 = itemView.findViewById(R.id.image1);
            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text11);
        }
    }
}
