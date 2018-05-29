package com.tan.retrofitdemo.config;

import com.tan.retrofitdemo.util.SharedPrefsUtil;
import com.tan.retrofitdemo.util.Sign;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/28.
 */

public class Constant {
    /** log用的tag */
    public static final String TAG = "tanjun";
    //public static final String PRODURL = "http://test3.p2phx.com:39004/";//dyt外网测试
    //public static final String PRODURL = "http://test3.p2phx.com:39004/app/";//外网测试

    public static final String PRODURL ="http://test_dyt-platapi.zimilbs.com:50400/"; //zmx外网测试

    //public static final String PRODURL = "http://dytapi-test.p2phx.com:19004/"; //外网测试

    public static final String login = "app/enc/login";

    public static final String DES_KEY = "abc45678901234567890ABCD";

    public static final String SIGN_KEY = "aFaj81aXawkj8XNOF3GFCUn2q903LN8U";

    public static final String SIGN_MAP_KEY = "sign";

    public static final String POSTTIME_MAP_KEY = "posttime";

    public static final String USER_ID = "userID";

    public static final String SH_NAME = "DYT_APP_SH";

    public static HashMap<String, String> addMap(HashMap<String, String> map) {
        String time = System.currentTimeMillis() + "";
        String sign = Sign.signNew(Constant.SIGN_KEY, time);
        map.put(Constant.SIGN_MAP_KEY, sign);
        map.put(Constant.POSTTIME_MAP_KEY, time);
        map.put(USER_ID, SharedPrefsUtil.getValue(null, USER_ID, ""));
        return map;
    }
}
