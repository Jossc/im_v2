package com.chat.commons.thread;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName ImThreadFactory
 * @Author chenzhuo
 * @Version 1.0
 * @Date 2019-08-22 22:39
 **/
public class ImThreadFactory implements ThreadFactory {

    private ThreadGroup threadGroup;

    private String groupName;

    private final boolean daemo;

    private AtomicInteger idGenerator = new AtomicInteger(1);

    public ImThreadFactory(String group) {
        this(group, false);
    }

    public ImThreadFactory(String groupName, boolean daemo) {
        this.groupName = groupName;
        this.daemo = daemo;
    }


    @Override
    public Thread newThread(Runnable r) {
        String name = getNextThreadName();
        Thread thread = new Thread(threadGroup, r, name, 0);
        thread.setDaemon(daemo);
        return thread;
    }

    /**
     * 获取下一个线程的名称
     *
     * @return
     */
    public String getNextThreadName() {
        return this.groupName + "-thread-" + this.idGenerator.getAndIncrement();
    }
}
