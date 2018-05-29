package com.tan.retrofitdemo.net;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 * @Description:
 * @Author: Simon
 * @Created: 2017/3/8 14:38
 */

public interface AppApi {
    @FormUrlEncoded
    @POST()
    Observable<Response<ResponseBody>> postRequest(@Url String url, @FieldMap Map<String, String> map);

    @GET()
    Observable<Response<ResponseBody>> getRequest(@Url String url, @QueryMap Map<String, String> map);
}
