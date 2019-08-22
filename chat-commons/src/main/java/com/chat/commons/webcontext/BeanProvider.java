package com.chat.commons.webcontext;

import org.springframework.context.ApplicationContext;

/**
 * @ClassName BeanProvider
 * @Author chenzhuo
 * @Version 1.0
 * @Date 2019-08-22 21:59
 **/
public class BeanProvider {
    private static ApplicationContext applicationContext;

    public BeanProvider() {
    }

    public static void initialize(ApplicationContext applicationContext) {
        BeanProvider.applicationContext = applicationContext;
    }

    /**
     * Get Bean by clazz.
     *
     * @param clazz Class
     * @param <T>   class type
     * @return Bean instance
     */
    public static <T> T getBean(Class<T> clazz) {
        if (applicationContext == null) {
            return null;
        }
        return applicationContext.getBean(clazz);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String beanId) {
        if (applicationContext == null) {
            return null;
        }
        return (T) applicationContext.getBean(beanId);
    }


}
