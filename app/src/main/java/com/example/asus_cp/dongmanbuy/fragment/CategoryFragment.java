package com.example.asus_cp.dongmanbuy.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.asus_cp.dongmanbuy.R;
import com.example.asus_cp.dongmanbuy.fragment.category_item_fragments.CategoryListFragment;
import com.example.asus_cp.dongmanbuy.fragment.category_item_fragments.ShangZhuangFragment;
import com.example.asus_cp.dongmanbuy.fragment.category_item_fragments.XiangBaoFragment;

/**
 * 分类子标签
 * Created by asus-cp on 2016-05-19.
 */
public class CategoryFragment extends Fragment {
    private FrameLayout cateGoryListFrameLayout;
    private FrameLayout contentFrameLayout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.category_fragment_layout,null);
//        cateGoryListFrameLayout= (FrameLayout) v.findViewById(R.id.frame_layout_category_list);
//        contentFrameLayout= (FrameLayout) v.findViewById(R.id.frame_layout_buf);
        CategoryListFragment categoryListFragment=new CategoryListFragment();
        XiangBaoFragment xiangBaoFragment=new XiangBaoFragment();
        ShangZhuangFragment shangZhuangFragment=new ShangZhuangFragment();

        FragmentManager manager=getChildFragmentManager();//注意用的是这个方法
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.frame_layout_category_list,categoryListFragment);
        transaction.add(R.id.frame_layout_buf,shangZhuangFragment);
        transaction.commit();

        return v;
    }
}
