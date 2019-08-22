package com.chat.logic.listener;

import com.chat.commons.enums.EventType;
import lombok.Getter;

/**
 * 抽象事件监听
 *
 * @ClassName AbstractBaseEvent
 * @Author chenzhuo
 * @Version 1.0
 * @Date 2019-08-22 22:05
 **/
@Getter
public abstract class AbstractBaseEvent {

    /**
     * 创建时间
     */
    private long createTime;

    /**
     * 事件类型
     */
    private EventType eventType;

    public AbstractBaseEvent(long createTime, EventType eventType) {
        this.createTime = createTime;
        this.eventType = eventType;
    }

    /**
     * 是否在消息主线程同步执行
     *
     * @return
     */
    public boolean isSynchronized() {
        return true;
    }
}
