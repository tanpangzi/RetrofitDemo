package com.tan.retrofitdemo.config;

/**
 * 服务端配置类
 * <p>
 * 此处定义服务器的链接地址配置和接口请求的方法，
 * <br> Author: 叶青
 * <br> Version: 1.0.0
 * <br> Date: 2016年4月4日
 * <br> Copyright: Copyright © 2016 xTeam Technology. All rights reserved.
 */
public class ConfigServer {

    // *****************************网请求消息状态码 ******************************//
    /** 请求接口数据成功状态码 */
    //public static final String RESPONSE_STATUS_SUCCESS = "0";
    public static final int RESPONSE_STATUS_SUCCESS = 0;
    /** 请求接口数据异常状态码 */
    public static final String RESPONSE_STATUS_FAIL = "99999";
    /** 本地上传失败 */
    public static final String EXCEPTION_UPLOAD_ERROR_STATUS = "80005";
    /** 请求接口TOKEN失效状态码 */
    public static final String RESPONSE_STATUS_TOKEN_ERROR = "101";

    // ***************************接口请求配置 ****************************//
    /** 服务器连接方法key */
    public static final String SERVER_METHOD_KEY = "method";
    /** 语言key */
    public static final String SERVER_LANGUAGE_KEY = "language";
    /** posttimeKey请求发送时间 */
    public static final String SERVER_POST_TIME_KEY = "posttime";
    /** signKey :40位的SHA签名 */
    public static final String SERVER_SIGN_KEY = "sign";

    /** 公司 */
    public static final String SYSTEM_ORG_ID = "24";
    /** 渠道 */
    public static final String SYSTEM_CHANNEL_ID = "001018888888888888";
    /** 租户 */
    public static final String SYSTEM_TENANT_ID = "0000100001";
    /** 服务器超时时间 */
    public static final int SERVER_CONNECT_TIMEOUT = 30000;

    /** 请求数据条数 */
    public static final String PAGE_COUNT = "10";

    /** 返回数据json最外层key */
    public static final String RESULT_JSON_STATUS = "code";
    public static final String RESULT_JSON_INFO = "msg";
    public static final String RESULT_JSON_DATA = "data";
    /** APP_KEY_OCR */
    public static final String APP_KEY_OCR = "SbfaBbgY89LME3aYWNJP1SYR";

    // /*********************** 服务器地址 ****************************//
    /** Api服务器地址 */
    //public static final String SERVER_API_URL = "http://192.168.6.218:8055/app/"; //开发
    //public static final String SERVER_API_URL = "http://192.168.5.16:9004/app/"; //测试
    //public static final String SERVER_API_URL = "http://192.168.5.70:9004/app/"; //集成开发环境
    //public static final String SERVER_API_URL = "http://dytapi-test.p2phx.com:19004/app/"; //外网测试
    //public static final String SERVER_API_URL = "http://api.daiyetong.com/app/"; //测试
    //public static final String SERVER_API_URL = "http://192.168.5.6:9004/app/"; //测试
    //public static final String SERVER_API_URL = "http://api.daiyetong.com/app/";//测试生产
    //public static final String SERVER_API_URL = "https://api.daiyetong.com/app/";//生产
    //public static final String SERVER_API_URL = "http://dytapi-test.p2phx.com:49004/app/";//外网测试
    //    public static final String SERVER_API_URL = "http://192.168.5.68:9004/app/";//外网测试

    /*** 紫米地址***/
    //public static final String SERVER_API_URL = "https://api.zimilbs.com/"; //生产
    //public static final String SERVER_API_URL = "http://192.168.5.68:50400/"; //测试内网
    //public static final String SERVER_API_URL = "http://192.168.5.68:50400/"; //测试内网
    //public static final String SERVER_API_URL = "http://192.168.5.138:8080/"; //杨洋开发环境
    public static final String SERVER_API_URL = "http://test_dyt-platapi.zimilbs.com:50400/"; //测试外网

    /** 登录接口 */
    public static final String METHOD_LOGIN = "app/enc/login";
    /** 版本更新检测 */
    public static final String METHOD_VERSION_CHECK = "app/version/check";
    /** 退出登录 */
    public static final String METHOD_LOGOUT = "app/auth/mine/logout";
    /** 修改密码 */
    public static final String METHOD_UPDATE_PASSWORD = "app/auth/enc/password/update";
    /** 合同查询 */
    public static final String METHOD_QUERYCONTRACTNO = "app/auth/loan/queryContractNo";
    /** 合同录入 */
    public static final String METHOD_SYNCUSTSERIALNUMBER = "app/auth/loan/SynCustSerialNumber";
    /** 我的数据 */
    public static final String METHOD_MAININFO = "app/auth/main/mainInfo";

    /** 录单首页 */
    public static final String METHOD_GETSELECTDATA = "app/common/getSelectData";
    /** 我的订单 */
    public static final String METHOD_QUERYLOANLIST = "app/auth/queryLoanList";
    /** 订单详情 */
    public static final String METHOD_BUSINESSDETAIL = "app/auth/businessdetail";
    /** 录单提交 */
    public static final String METHOD_RECORDLOAN = "app/auth/submissionAssessment";
    /** 录单提交 /app/auth/saveCustInfo */
    public static final String METHOD_SAVECUSTINFO = "app/auth/saveCustInfo";
    /** 录单提交 保存补充信息("/app/auth/saveSupplyInformation") */
    public static final String METHOD_SAVESUPPLYINFORMATION = "app/auth/saveSupplyInformation";
    /** 查询产品大类信息 */
    public static final String METHOD_QUERYAPVPRODUCTINF = "app/auth/queryApvProductInf";
    /** 获取RequestNo */
    public static final String METHOD_GENERATEREQUESTNO = "app/auth/task/generateRequestNo";
    /** 城市列表 */
    public static final String METHOD_GETAREALIST = "app/common/getAreaList";
    /** 删除图片   @POST("/app/auth/image/newDeleteImg") */
    public static final String METHOD_NEWDELETEIMG = "app/auth/image/newDeleteImg";
    /** 图片上传   @POST("/app/auth/image/newUploadImg") */
    public static final String METHOD_IMGUPLOAD = "app/auth/image/newUploadImg"; //
    /** 入单提交      @POST("/app/auth/workflowStart") */
    public static final String METHOD_WORKFLOWSTART = "app/auth/workflowStart"; //
    /** 样例图获取     OST("/app/auth/readImageSample") */
    public static final String METHOD_READIMAGESAMPLE = "app/auth/readImageSample"; //

    /** 金真估的 车型数据 和 城市数据 */
    public static final String METHOD_GETJINGZHENGUDATA = "app/auth/getJingZhenGuData";
    /** 金真估的提交评估 */
    public static final String METHOD_GETJINGZHENGUOBJECTDATAA = "app/auth/getJingZhenGuObjectData";

    /** 车辆估计 gps安装 车辆抵押 */
    public static final String QUERYTASKLISTDATA = "app/auth/task/queryTaskListData";

    /** 点击签收 */
    public static final String WORKFLOWCLAIM = "app/auth/task/workflowClaim";

    /** 车辆评估 查询车辆信息 */
    public static final String QUERYEVALCARINFO = "app/auth/task/queryEvalCarInfo";

    /** 获取RequestNo 防重复提交用 */
    public static final String GENERATEREQUESTNO = "app/auth/task/generateRequestNo";

    /** 提交车辆评估信息 第一个界面 */
    public static final String UPDATEEVALCARINFO = "app/auth/task/updateEvalCarInfo";

    /** 车辆评估 第二个界面 保存 */
    public static final String SAVECAREVALUATION = "app/auth/task/saveCarEvaluation";

    /** 车辆抵押 第一个界面  信息查询 */
    public static final String QUERYMORTGAGEINFO = "app/auth/task/queryMortgageInfo";


    /** 车辆抵押第二个界面 提交信息 */
    public static final String UPDATELOANAUDIBYBUSSINESSID = "app/auth/task/updateLoanAudiByBussinessId";

    /** 车辆解押 获取列表 */
    public static final String QUERYRESCISSIONMORTGAGELIST = "app/auth/task/queryRescissionMortgageList";

    /** 提交解押 */
    public static final String RESCISSIONMORTGAGEAPPL = "app/auth/task/rescissionMortgageAppl";


    // GPS监控**********************************************
    /** GPS监控获取门店列表     @POST("/app/gps/getStoreList") */
    public static final String METHOD_GETSTORELIST = "app/auth/getStoreList";
    /** GPS监控获取门店下设备列表        @POST("/app/gps/getEquipmentList") */
    public static final String METHOD_GETEQUIPMENTLIST = "app/auth/getEquipmentList";
    /** 超级管管理员GPS监控获取门店下设备列表 */
    public static final String METHOD_GETEQUIPMENTLIST_FORSUPERMANAGER = "app/auth/getEquipmentListForSuperManager";
    /** 超级管管理员GPS监控获取 报警设备列表        @POST("/app/auth/getAlarmList") */
    public static final String METHOD_GETALARMLIST = "app/auth/getAlarmList";
    /** 超级管管理员GPS监控获取 报警设备列表    @POST("/app/gps/getAlarmScreeningList") */
    public static final String METHOD_GETALARMSCREENINGLIST = "app/auth/getAlarmScreeningList";
    /** 超级管管理员GPS监控获取 分组授权    @POST("/app/gps/queryCompanyRelUser") */
    public static final String METHOD_QUERYCOMPANYRELUSER = "app/auth/queryCompanyRelUser";
    /** 超级管管理员GPS监控获取 分组授权提交    @POST("/app/gps/storeAuthorize") */
    public static final String METHOD_STOREAUTHORIZE = "app/auth/storeAuthorize";
    //    @POST("/app/gps/getLocationInfo")
    public static final String METHOD_GETLOCATIONINFO = "app/auth/getLocationInfo";
    //    @POST("/app/gps/getTrackPlayback")
    public static final String METHOD_GETTRACKPLAYBACK = "app/auth/getTrackPlayback";
    //    @POST("/app/gps/queryAllUser")
    public static final String METHOD_QUERYALLUSER = "app/auth/queryAllUser";
    //    @POST("/app/gps/equipmentAuthorize")
    public static final String METHOD_EQUIPMENTAUTHORIZE = "app/auth/equipmentAuthorize";
    //    @POST("/app/gps/updateUploadTime")
    public static final String METHOD_UPDATEUPLOADTIME = "app/auth/updateUploadTime";

    /****************紫米星Gps安装*****************************/
    /** 获取组织信息 */
    public static final String METHOD_ORGANIZATION = "/app/auth/getOrganization";
    /** 提交客户信息 */
    public static final String METHOD_CREATECUSTINFO = "/app/auth/createCustInfo";
    /** gps安装 输入imei sim */
    public static final String METHOD_GETIMEIINFO = "/app/auth/task/getImeiInfo";
    /** gps安装 设备信息 下一步 */
    public static final String METHOD_DETECT = "/app/auth/detect";
    /** 装车位置 绑定 */
    public static final String METHOD_NEWBINDING = "/app/auth/task/newBinding";
    /** 查询图片 */
    public static final String METHOD_QUERYALLIMGBYPARAMS = "/app/auth/task/queryAllImgByParams";
    /** 上传图片 */
    public static final String METHOD_UPLOADIMG = "/app/auth/task/uploadImg";
    /** 删除图片 */
    public static final String METHOD_DELETEIMG = "/app/auth/task/deleteImg";
    /** gps安装 获取定位信息 */
    public static final String METHOD_GETLOCATIONINFOS = "/app/auth/task/getLocationInfos";

    /** gps拆除*/
    public static final String METHOD_TEARDOWN =  "/app/auth/task/teardown";
    /**锁油 断电指令 */
    public static final String METHOD_INSTRUCTIONS = "/app/auth/instructions";

    /** 点击完成 */
    public static final String METHOD_COMPLETETASK = "/app/auth/task/completeTask";


}