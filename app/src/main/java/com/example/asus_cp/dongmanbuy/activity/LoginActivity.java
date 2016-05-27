package com.example.asus_cp.dongmanbuy.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus_cp.dongmanbuy.R;

/**
 * 登录的界面
 * Created by asus-cp on 2016-05-27.
 */
public class LoginActivity extends Activity implements View.OnClickListener{

    private EditText zhangHaoEditText;//账号
    private EditText passWordEdtiText;//密码
    private ImageView seePassWordImagView;//设置显示密码还是明码
    private TextView forgetPassWord;//忘记密码
    private Button loginButton;//登录按钮
    private TextView userRegister;//用户注册
    private LinearLayout qqLinearLayout;//qq
    private LinearLayout weiBoLinearLayout;//微博
    private LinearLayout weiXinLinearLayout;//微信
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//不要标题栏
        setContentView(R.layout.login_layout);
        zhangHaoEditText= (EditText) findViewById(R.id.edit_zhang_hao);
        passWordEdtiText= (EditText) findViewById(R.id.edit_password);
        seePassWordImagView= (ImageView) findViewById(R.id.img_see_password);
        forgetPassWord= (TextView) findViewById(R.id.text_forget_password);
        loginButton= (Button) findViewById(R.id.btn_login);
        userRegister= (TextView) findViewById(R.id.text_new_user_register);
        qqLinearLayout= (LinearLayout) findViewById(R.id.ll_qq);
        weiBoLinearLayout= (LinearLayout) findViewById(R.id.ll_wei_bo);
        weiXinLinearLayout= (LinearLayout) findViewById(R.id.ll_wei_xin);

        seePassWordImagView.setOnClickListener(this);
        forgetPassWord.setOnClickListener(this);
        loginButton.setOnClickListener(this);
        userRegister.setOnClickListener(this);
        qqLinearLayout.setOnClickListener(this);
        weiBoLinearLayout.setOnClickListener(this);
        weiXinLinearLayout.setOnClickListener(this);
    }


    /**
     * 点击事件
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_see_password:
                Toast.makeText(this,"点击了隐藏账号",Toast.LENGTH_SHORT).show();
                break;
            case R.id.text_forget_password:
                Toast.makeText(this,"点击了忘记密码",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_login:
                Toast.makeText(this,"点击了登录按钮",Toast.LENGTH_SHORT).show();
                break;
            case R.id.text_new_user_register://用户注册
                Intent registerIntent=new Intent(this,RegisterActivity.class);
                startActivity(registerIntent);
                break;
            case R.id.ll_qq:
                Toast.makeText(this,"点击了qq登录",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_wei_bo:
                Toast.makeText(this,"点击了微博登录",Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_wei_xin:
                Toast.makeText(this,"点击了微信登录",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
