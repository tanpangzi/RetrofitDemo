package com.tan.retrofitdemo.net;

/**
 * @Description:
 * @Author: Simon
 * @Created: 2017/3/27 18:14
 */

public interface JsonCallBack {

    //void next(String response);
    void next(Result data);

    void error(Throwable e);

    void startLoading();

    void closeLoading();

}
