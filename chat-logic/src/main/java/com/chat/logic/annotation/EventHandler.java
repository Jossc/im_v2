package com.chat.logic.annotation;

import com.chat.commons.enums.EventType;

import java.lang.annotation.*;

/**
 * @ClassName EventHandler
 * @Author chenzhuo
 * @Version 1.0
 * @Date 2019-08-22 22:31
 **/
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventHandler {

    /**
     * 绑定的事件类型列表
     */
    public EventType[] value();

}
