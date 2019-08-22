package com.chat.commons.enums;

import lombok.Getter;

/**
 * 事件类型
 *
 * @ClassName EventType
 * @Author chenzhuo
 * @Version 1.0
 * @Date 2019-08-22 22:12
 **/
@Getter
public enum EventType {

    /**
     * 登录事件
     */
    LOGIN,

    /**
     * 登出事件
     */
    LOGOUT,

    /**
     * 升级事件
     */
    LEVEL_UP;

}
