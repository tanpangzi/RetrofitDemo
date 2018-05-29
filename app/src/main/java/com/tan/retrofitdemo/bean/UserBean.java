package com.tan.retrofitdemo.bean;

import org.json.JSONException;
import org.json.JSONObject;

public class UserBean extends BaseBean{



    /** 极光托送alias */
    private String alias;
    /** 返回的 */
    private String userName;
    /** userId */
    private String userId;
    /** token */
    private String token;
    /** 权限列表 */
    private String permissionKey;


    @Override
    protected void init(JSONObject jSon) throws JSONException {
        alias = jSon.optString("alias","");
        userName = jSon.optString("userName","");
        userId = jSon.optString("userId","");
        token = jSon.optString("token","");
        permissionKey = jSon.optString("permissionKey","");

        permissionKey = permissionKey.substring(1,permissionKey.length() -1);
    }


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPermissionKey() {
        return permissionKey;
    }

    public void setPermissionKey(String permissionKey) {
        this.permissionKey = permissionKey;
    }

}
