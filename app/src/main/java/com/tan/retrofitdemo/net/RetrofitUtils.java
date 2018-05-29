package com.tan.retrofitdemo.net;


import android.util.Log;
import android.util.MutableShort;

import com.google.gson.Gson;
import com.tan.retrofitdemo.bean.BaseBean;
import com.tan.retrofitdemo.bean.UserBean;
import com.tan.retrofitdemo.config.Constant;
import com.tan.retrofitdemo.util.GsonUtil;

import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Response;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * @Description:
 * @Author: Simon
 * @Created: 2017/3/27 15:59
 */

public class RetrofitUtils {

    private static RetrofitUtils mRetrofitUtils;
    private int statePos = 0;//0:弹出加载框；1:不弹出
    private Gson mGson = new Gson();

    private RetrofitUtils() {
    }

    public static RetrofitUtils getInstance() {
        if (mRetrofitUtils == null) {
            synchronized (RetrofitUtils.class) {
                if (mRetrofitUtils == null) {
                    mRetrofitUtils = new RetrofitUtils();
                }
            }
        }
        return mRetrofitUtils;
    }

    public RetrofitUtils setStatePos(int statePos) {
        this.statePos = statePos;
        return this;
    }

    /**
     * get请求
     * @param url
     * @param map
     * @param callBack
     */
    public void normalGet(String url, Map<String, String> map, final JsonCallBack callBack) {
        RetrofitManager.getInstance()
                .createReq(AppApi.class)
                .getRequest(url, map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Response<ResponseBody>>() {

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        callBack.error(e);
                        LogUtils.e("(请求框架)：" + e);
                    }

                    @Override
                    public void onNext(Response<ResponseBody> response) {
                        try {
                            String res = response.body().string();
                            Log.e("tanjun", res + "\r\n");//返回所有数据
                            Result result = new Result();
                            result.init(new JSONObject(res));
                            /** 获取返回的code */
                            int retCode = result.getCode();
                            getErrorMsg(retCode);
                            Log.e(Constant.TAG, result.getData().toString()); //获取的data

                            callBack.next(result);
                        } catch (Exception e) {
                            callBack.error(e);
                            LogUtils.e("(请求框架)：" + e);
                        }
                    }
                });
    }


    /**
     * post请求 最常用的
     * @param url
     * @param map
     * @param callBack
     */
    public void normalPost(final String url, Map<String, String> map, final JsonCallBack callBack) {
        if (statePos == 0) {
            callBack.startLoading();
        }
        RetrofitManager.getInstance()
                .createReq(AppApi.class)
                .postRequest(url, map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Response<ResponseBody>>() {

                    @Override
                    public void onCompleted() {
                        callBack.closeLoading();
                    }

                    @Override
                    public void onError(Throwable e) {
                        callBack.closeLoading();
                        callBack.error(e);
                        LogUtils.e("(请求框架onError)：" + e);
                        e.printStackTrace();
                    }

                    @Override
                    public void onNext(Response<ResponseBody> response) {
                        callBack.closeLoading();
                        try {
                            String res = response.body().string();
                            Log.e(Constant.TAG, res + "\r\n");//返回所有数据
                            Result result = new Result();
                            result.init(new JSONObject(res));
                            //Result obj = mGson.fromJson(res, Result.class);
                            //BaseBean.setResponseObject(result, UserBean.class);
                            //result.setData(GsonUtil.getInstance().json2Bean((String) result.getData(), UserBean.class));
                            /** 获取返回的code */
                            int retCode = result.getCode();
                            getErrorMsg(retCode);
                            Log.e(Constant.TAG, result.getData().toString()); //获取的data
                            callBack.next(result);
                        } catch (Exception e) {
                            LogUtils.e("(请求框架onNext)：" + e);
                        }
                    }
                });
    }


    /**
     * post请求
     * @param url
     * @param map
     * @param state
     * @param callBack
     */
    public void normalPost(String url, Map<String, String> map, String state, final JsonCallBack callBack) {
        callBack.startLoading();
        new RetrofitManager(state)
                .createReq(AppApi.class)
                .postRequest(url, map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Response<ResponseBody>>() {

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        callBack.error(e);
                        LogUtils.e(e);
                    }

                    @Override
                    public void onNext(Response<ResponseBody> response) {
                        try {
                            String res = response.body().string();
                            Log.e(Constant.TAG, res + "\r\n");//返回所有数据
                            Result result = new Result();
                            result.init(new JSONObject(res));

                            /** 获取返回的code */
                            int retCode = result.getCode();
                            getErrorMsg(retCode);
                            Log.e(Constant.TAG, result.getData().toString()); //获取的data
                        } catch (Exception e) {
                            LogUtils.e("请求失败=======" + e);
                            callBack.error(e);
                            callBack.closeLoading();
                        }
                    }
                });
    }


    /**
     * 根据返回Code判断消息并处理
     * add by tanjun
     * @param retCode
     */
    private String getErrorMsg(int retCode){
        String message = "";
        switch (retCode){
            case 120:
                message = "用户名或密码错误，请重新登录！";
                break;
            case 101:
                //Constant.setToken(null);
                message = "登录已过期，请重新登录！";
                break;
            case 102:
                message = "签名无效！";
                break;
            case 112:
                message = "参数不能为空！";
                break;
            case 1:
                message = "操作失败！";
                break;
            case 100:
                message = "Token过期!";
                break;
            case 111:
                message = "参数长度非法";
                break;
            case 110:
                message = "参数格式非法";
                break;
            case 404:
                message = "服务器连接失败";
                break;
            case 500:
                message = "服务器内部错误";
                break;
            case 502:
                message = "当前网络不可用，请重新检查网络设置";
                break;
            case 400:
                message = "请求错误";
                break;
            case 135:
                message = "原始密码错误";
                break;
            case 410:
                message = "找不到对应的数据！";
                break;
            default:
                message = "未知错误";
                break;
        }
        return message;

    }
}
