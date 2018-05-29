package com.tan.retrofitdemo.net;

import com.tan.retrofitdemo.bean.BaseBean;

import org.json.JSONException;
import org.json.JSONObject;


/**
 * 返回的总数据
 * created by tanjun
 */
public class Result extends BaseBean{
    /** 返回Code */
    private int code;
    /** 返回信息 */
    private String msg;
    /** 返回内容 */
    private Object data;//返回结果都用String 方便控制

    public Result() {
    }

    public Result(String jsonSrc) {
        super(jsonSrc);
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object object) {
        this.data = object;
    }

    @Override
    protected void init(JSONObject jSon) throws JSONException {
        code = jSon.optInt("code", -1);
        msg = jSon.optString("msg", "");
        data = jSon.optString("data","");

    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", object=" + data +
                '}';
    }
}
