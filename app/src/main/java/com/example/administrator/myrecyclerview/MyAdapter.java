package com.example.administrator.myrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/12/5 0005.
 */

//ViewHolder子类泛型
//需要重载onCreateViewHolder、onBindViewHolder、getItemCount三个方法
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    //onCreateViewHolder方法中使用一个LayoutInflater将item的布局视图填充起来
    //然后返回一个MyViewHolder实例，这个实例将操作具体的item部件
    //总结为创建一个MyViewHolder并填充这个MyViewHolder所管理的item布局
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mLayoutInflater = LayoutInflater.from(parent.getContext());
        View v = mLayoutInflater.inflate(R.layout.show_item,parent,false);
        return new MyViewHolder(v);
        }

    //绑定MyViewHolder和position的关系
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText("test----"+position);
    }

    //返回item的数量
    @Override
    public int getItemCount() {
        return 100;
    }
}
