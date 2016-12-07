package com.example.administrator.myrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/12/5 0005.
 */

//MyViewHolder继承自ViewHolder，用于管理item的布局视图
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView mTextView;
    Button mButton;
    private String msg;

//    private MyItemClickListener mListenner;
//    private MyItemLongClickListener mLongListenner;

    public MyViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.item_txt_test);
        mButton = (Button) itemView.findViewById(R.id.item_btn_set);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg = String.format("this is item-" + getLayoutPosition());//获取当前位置（第几排？）
                Toast.makeText(view.getContext(), msg, Toast.LENGTH_LONG).show();
            }
        });

        mTextView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                msg = String.format("long press text " + getLayoutPosition());//获取当前位置（第几排？）
                Toast.makeText(view.getContext(), msg, Toast.LENGTH_LONG).show();
                return false;
            }
        });
        //itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {


    }

}
