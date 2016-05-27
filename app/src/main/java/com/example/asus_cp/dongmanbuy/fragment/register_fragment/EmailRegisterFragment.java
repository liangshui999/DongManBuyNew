package com.example.asus_cp.dongmanbuy.fragment.register_fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus_cp.dongmanbuy.R;

/**
 * 邮箱注册的碎片
 * Created by asus-cp on 2016-05-27.
 */
public class EmailRegisterFragment extends Fragment implements View.OnClickListener{
    private Context context;

    private String userName;//用户输入的用户名
    private String email;//用户输入的邮箱
    private String password;//用户输入的密码
    private String confirmPassword;//用户的确认密码

    private EditText userNameEditText;
    private EditText inputEmailEditText;
    private EditText inputPasswordEditText;
    private EditText inputAgainPasswordEditText;
    private ImageView seePasswordImageView;//判断密码是否可见的imageview
    private ImageView seeAgainPasswordImageView;
    private Button registerButton;
    private TextView zhiJieLoginTextView;//已注册直接登录

    private int passwordFlag;//判断password的点击状态
    private int againPasswordFlag;//判断againpassword的状态
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.email_register_fragment_layout,container,false);
        init(v);
        return v;
    }

    private void init(View v) {
        context=getActivity();

        userNameEditText = (EditText) v.findViewById(R.id.edit_user_name);
        inputEmailEditText = (EditText) v.findViewById(R.id.edit_input_email);

        inputPasswordEditText= (EditText) v.findViewById(R.id.edit_password_email_register);
        inputAgainPasswordEditText= (EditText) v.findViewById(R.id.edit_password_again_email_register);
        seePasswordImageView= (ImageView) v.findViewById(R.id.img_see_password_email_register);
        seeAgainPasswordImageView= (ImageView) v.findViewById(R.id.img_see_password_again_email_register);
        registerButton= (Button) v.findViewById(R.id.btn_email_register);
        zhiJieLoginTextView= (TextView) v.findViewById(R.id.text_zhi_jie_login_email_register);

        //设置点击事件

        seePasswordImageView.setOnClickListener(this);
        seeAgainPasswordImageView.setOnClickListener(this);
        registerButton.setOnClickListener(this);
        zhiJieLoginTextView.setOnClickListener(this);
    }

    /**
     * 点击事件的设置
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_email_register://点击了注册按钮

                break;
            case R.id.text_zhi_jie_login_email_register://点击了直接登录
                Toast.makeText(context,"点击了直接登录",Toast.LENGTH_SHORT).show();
                break;
            case R.id.img_see_password_email_register://点击了改变密码明码
                if(passwordFlag%2==0){
                    seePasswordImageView.setBackgroundResource(R.drawable.see_password_selected);
                    inputPasswordEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else{
                    seePasswordImageView.setBackgroundResource(R.drawable.see_password_normal);
                    inputPasswordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                passwordFlag++;

                break;
            case R.id.img_see_password_again_email_register://重新改变密码明码
                if(againPasswordFlag%2==0){
                    seeAgainPasswordImageView.setBackgroundResource(R.drawable.see_password_selected);
                    inputAgainPasswordEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }else{
                    seeAgainPasswordImageView.setBackgroundResource(R.drawable.see_password_normal);
                    inputAgainPasswordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                againPasswordFlag++;
                break;
        }
    }
}
