package com.example.asus_cp.dongmanbuy.fragment.category_item_fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.asus_cp.dongmanbuy.R;
import com.example.asus_cp.dongmanbuy.util.MyApplication;

import java.util.ArrayList;
import java.util.List;

/**
 * 下装内容
 * Created by asus-cp on 2016-05-25.
 */
public class XiaZhuangFragment extends Fragment{
    private ListView xiaZhaungListView;
    private List<String> xiaZhuangs;
    private Context context;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.xia_zhuang_fragment_layout,null);
        xiaZhaungListView= (ListView) v.findViewById(R.id.list_view_xia_zhuang);
        init();
        return v;
    }

    /**
     * 初始化的方法
     */
    private void init() {
        context= MyApplication.getContext();
        xiaZhuangs=new ArrayList<String>();
        xiaZhuangs.add("卫裤");
        xiaZhuangs.add("牛仔裤");
        xiaZhuangs.add("工装裤");
        xiaZhuangs.add("短裤");
        xiaZhuangs.add("裙子");
        xiaZhuangs.add("内裤");
        ArrayAdapter arrayAdapter=new ArrayAdapter(context,R.layout.category_tong_yong_item_layout,xiaZhuangs);
        xiaZhaungListView.setAdapter(arrayAdapter);
        xiaZhaungListView.setDividerHeight(0);
        xiaZhaungListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context,xiaZhuangs.get(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
