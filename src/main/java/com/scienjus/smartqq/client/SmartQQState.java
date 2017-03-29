package com.scienjus.smartqq.client;

/**
 * Created by tata on 2017/3/27.
 */
public enum SmartQQState {
    /**
     * 初始化
     */
    INIT,
    /**
     * 等待扫码，二维码已更新
     */
    WAIT_LOGIN_NEW_QRCODE,
    /**
     * 等待扫码
     */
    WAIT_LOGIN,
    /**
     * 已登陆
     */
    LOGINED,
    /**
     * 已退出
     */
    LOGOUT
}
