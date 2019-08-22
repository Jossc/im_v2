package com.chat.logic.dispatch;

/**
 * 抽象任务分发
 *
 * @ClassName AbstractDispatchTask
 * @Author chenzhuo
 * @Version 1.0
 * @Date 2019-08-22 22:28
 **/
public abstract class AbstractDispatchTask implements Runnable {

    /**
     * 分发任务的key
     */
    public int dispatchKey;

    public int getDispatchKey() {
        return dispatchKey;
    }


}
