package com.lijin.test;

import com.lijin.domain.Account;
import com.lijin.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        IAccountService accountService = ac.getBean("accountService", IAccountService.class);

        accountService.findAllAccount();
        accountService.saveAccount(new Account());
    }
}
