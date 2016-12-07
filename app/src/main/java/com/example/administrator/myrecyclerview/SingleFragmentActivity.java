package com.example.administrator.myrecyclerview;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;


abstract class SingleFragmentActivity extends FragmentActivity {

    FragmentManager mFragmentManager;
    MainFragment mFragment;

    //抽象方法，用于获取一个MainFragment
    abstract MainFragment CreateSingleFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_container);//显示fragment容器里面的东西

        mFragmentManager = getFragmentManager();


        if (mFragment == null) {

            mFragment = CreateSingleFragment();//获取MainFragment

            mFragmentManager.beginTransaction().add(R.id.SingleFragmentContainer, mFragment).commit();//动态加载fragment

        }

    }

}