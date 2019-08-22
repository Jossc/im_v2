package com.chat.logic.message;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * 消息分发
 *
 * @ClassName MessageDispatcher
 * @Author chenzhuo
 * @Version 1.0
 * @Date 2019-08-22 22:35
 **/
@Component
public class MessageDispatcher {

    /**
     * cpu数量
     */
    private final int CORE_SIZE = Runtime.getRuntime().availableProcessors();


    @PostConstruct
    public void init() {

    }

}
