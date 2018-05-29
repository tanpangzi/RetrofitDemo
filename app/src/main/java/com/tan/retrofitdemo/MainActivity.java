package com.tan.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.tan.retrofitdemo.bean.BaseBean;
import com.tan.retrofitdemo.bean.UserBean;
import com.tan.retrofitdemo.config.Constant;
import com.tan.retrofitdemo.net.JsonCallBack;
import com.tan.retrofitdemo.net.Result;
import com.tan.retrofitdemo.net.RetrofitUtils;
import com.tan.retrofitdemo.net.ThreeDES;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {

    Button btn_click;
    TextView tv_result;

    EditText et_username, et_password;

    private static final String USERNAME_KEY = "username";
    private static final String PASSWORD_KEY = "password";
    private static final String ENCODING_KEY = "encoding";

    public static String YYS_URL = "http://u14.mmbang.com/open/article/list/?%20mobile_os=android&group=mobile&device=000000000000000";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_click = findViewById(R.id.btn_clock);
        tv_result = findViewById(R.id.tv_result);

        et_password = findViewById(R.id.et_password);
        et_username = findViewById(R.id.et_username);

        btn_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
        //clickTest();
    }


    private void login(){
        String name = et_username.getText().toString();
        String password = et_password.getText().toString();
        HashMap<String, String> map = ThreeDES.getPostHeadMap();
        map.put(USERNAME_KEY, name);
        map.put(PASSWORD_KEY, password);
        map = ThreeDES.paramsEncrypt(map);
        RetrofitUtils.getInstance().normalPost(Constant.PRODURL + Constant.login, map, new JsonCallBack() {

            @Override
            public void next(Result data) {
                 /** 将返回的结果set进相应的bean */
                BaseBean.setResponseObject(data, UserBean.class);
                UserBean bean = (UserBean) data.getData();
                String alias = bean.getAlias();
                String token = bean.getToken();
                String msg = data.getMsg();
                int retCode = data.getCode();
            }

            @Override
            public void error(Throwable e) {

            }

            @Override
            public void startLoading() {

            }

            @Override
            public void closeLoading() {

            }
        });
    }

    /*private void clickTest() {
        try {
            Map map = new TreeMap();
            map.put(USERNAME_KEY, "13544444444");
            map.put(PASSWORD_KEY, "123456");
           *//* map = Constant.addMap(map);
            String encoding = ThreeDES.encrypt(JsonUtil.packageJsonObject(map), Constant.DES_KEY);

            Map map1 = new TreeMap<>();
            map1.put(ENCODING_KEY, encoding);
            map1 = Constant.addMap(map1);*//*

            RetrofitUtils.getInstance().normalGet(YYS_URL, map, new JsonCallBack() {
                @Override
                public void next(String response) {

                    Log.e("tanjun", response);
                    tv_result.setText("tanjun" + response);
                    Toast.makeText(MainActivity.this, response, Toast.LENGTH_SHORT).show();
                }

                @Override
                public void error(Throwable e) {

                }

                @Override
                public void startLoading() {

                }

                @Override
                public void closeLoading() {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
