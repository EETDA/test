package com.qf;

import com.qf.entity.Account;
import com.qf.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = ctx.getBean("accountService",AccountService.class);
        accountService.findAll();
        accountService.saveAccount(new Account());
    }
}
