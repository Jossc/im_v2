package com.chat.logic.listener;

import com.chat.commons.enums.EventType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName ListenerManager
 * @Author chenzhuo
 * @Version 1.0
 * @Date 2019-08-22 22:17
 **/
@Slf4j
@Component
public class ListenerManager {
    /**
     * concurrentHashMap 存放监听
     */
    private Map<String, Method> listenerMap = new ConcurrentHashMap<>();


    /**
     * 注册监听事件
     *
     * @param listener  监听的对象
     * @param eventType 时间类型
     * @param method    方法
     */
    public void registerEventListener(Object listener, EventType eventType, Method method) {
        log.info("listener {}, eventType {}, method {}", listener, eventType, method.getName());
        listenerMap.put(getKey(listener, eventType), method);
    }


    /**
     * 获取key
     *
     * @param handler
     * @param eventType 事件类型
     * @return
     */
    private String getKey(Object handler, EventType eventType) {
        return handler.getClass().getName() + "-" + eventType.toString();
    }


    /**
     * 分发事件
     *
     * @param handler object
     * @param event   事件
     */
    public void dispatcherEvent(Object handler, AbstractBaseEvent event) {
        log.info("handler {},even t{}", handler, event);
        try {
            Method method = listenerMap.get(getKey(handler, event.getEventType()));
            method.invoke(handler, event);
        } catch (Exception e) {
            log.error("exception {}", e);
        }
    }

}
