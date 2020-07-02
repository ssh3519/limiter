package com.ssh.limiter.config;

/**
 * @description 限流类型
 * @author: ssh
 * @email: 18367183519@163.com
 * @Date: 2020/7/2 9:58
 */
public enum LimitType {
    /**
     * 自定义key
     */
    CUSTOMER,

    /**
     * 请求者IP
     */
    IP;
}
