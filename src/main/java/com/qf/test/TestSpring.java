package com.qf.test;

import com.qf.service.AccountService;
import com.qf.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void run(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = ctx.getBean("accountService", AccountServiceImpl.class);

    }
}
