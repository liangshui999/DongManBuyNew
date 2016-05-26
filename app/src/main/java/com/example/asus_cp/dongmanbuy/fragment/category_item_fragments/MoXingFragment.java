package com.example.asus_cp.dongmanbuy.fragment.category_item_fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.example.asus_cp.dongmanbuy.R;

/**
 * 模型的内容
 * Created by asus-cp on 2016-05-25.
 */
public class MoXingFragment extends Fragment{
    private TextView shouBanTextView;
    private TextView moXingTextView;
    private GridView shouBanGridView;
    private GridView moXingGridView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.mo_xing_fragment_layout,null);
        shouBanTextView= (TextView) v.findViewById(R.id.text_shou_ban);
        moXingTextView= (TextView) v.findViewById(R.id.text_mo_xing);
        shouBanGridView= (GridView) v.findViewById(R.id.grid_view_shou_ban);
        moXingGridView= (GridView) v.findViewById(R.id.grid_view_mo_xing);
        return v;
    }
}
