package com.example.administrator.myrecyclerview;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MainFragment extends Fragment {


    RecyclerView mRecycler;
    MyAdapter mMyAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v;
        v = inflater.inflate(R.layout.fragment_main, container, false);//填充视图
        mRecycler = (RecyclerView) v.findViewById(R.id.contents_recyclerview);//根据id得到一个RecyclerView实例

        //在使用RecyclerView的时候需要确定布局方式
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        //新建一个adapter，应用于管理viewholder
        mMyAdapter = new MyAdapter();
        mRecycler.setAdapter(mMyAdapter);

        return v;
    }

}
