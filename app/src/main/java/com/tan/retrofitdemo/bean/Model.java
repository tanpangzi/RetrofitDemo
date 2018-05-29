package com.tan.retrofitdemo.bean;

import com.tan.retrofitdemo.config.ConfigServer;
import com.tan.retrofitdemo.net.Result;

/**
 * 用来处理网络请求
 */
public class Model {

    /**
     * 校验网络请求是否成功 现在定 0 是成功
     * <p>
     * <br> Version: 1.0.0
     * <br> CreateTime: 2016-11-25,上午10:34:23
     * <br> UpdateTime: 2016-11-25,上午10:34:23
     * <br> CreateAuthor: 叶青
     * <br> UpdateAuthor: 叶青
     * <br> UpdateInfo: (此处输入修改内容,若无修改可不写.)
     *
     * @param result
     *         网络请求返回的初始数据
     *
     * @return true操作成功 false操作不成功
     */
    public static boolean checkSuccess(Result result) {
        return result != null && (result.getCode() == ConfigServer.RESPONSE_STATUS_SUCCESS);
    }

}
