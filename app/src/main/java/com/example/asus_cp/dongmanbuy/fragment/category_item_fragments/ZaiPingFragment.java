package com.example.asus_cp.dongmanbuy.fragment.category_item_fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus_cp.dongmanbuy.R;
import com.example.asus_cp.dongmanbuy.customview.MyGridView;

/**
 * 宅品的内容
 * Created by asus-cp on 2016-05-25.
 */
public class ZaiPingFragment extends Fragment {
    private MyGridView mingXinPianGridView;//明信片
    private MyGridView puKePaiGridView;//扑克牌
    private MyGridView taiLiGridView;//台历

    private TextView mingXinPianTextView;
    private TextView daLiBaoTextView;
    private TextView puKePaiTextView;
    private TextView taiLiTextView;
    private TextView qianBaoTextView;
    private TextView biJiBenTextView;
    private TextView tongRenTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.zai_ping_fragment_layout,null);
        mingXinPianGridView= (MyGridView) v.findViewById(R.id.grid_view_ming_xin_pian);
        puKePaiGridView= (MyGridView) v.findViewById(R.id.grid_view_pu_ke_pai);
        taiLiGridView= (MyGridView) v.findViewById(R.id.grid_view_tai_li);

        mingXinPianTextView= (TextView) v.findViewById(R.id.text_ming_xin_pian);
        daLiBaoTextView= (TextView) v.findViewById(R.id.text_da_li_bao);
        puKePaiTextView= (TextView) v.findViewById(R.id.text_pu_ke_pai);
        taiLiTextView= (TextView) v.findViewById(R.id.text_tai_li);
        qianBaoTextView= (TextView) v.findViewById(R.id.text_qian_bao);
        biJiBenTextView= (TextView) v.findViewById(R.id.text_bi_ji_ben);
        tongRenTextView= (TextView) v.findViewById(R.id.text_tong_ren);
        return v;
    }
}
