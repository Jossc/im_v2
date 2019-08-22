package com.chat.server;

import com.chat.commons.webcontext.BeanProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @ClassName Application
 * @Author chenzhuo
 * @Version 1.0
 * @Date 2019-08-22 21:56
 **/
@SpringBootApplication
@EnableAsync
public class Application {

    public static void main(String[] args) {
        BeanProvider.initialize(SpringApplication.run(Application.class, args));
    }
}
