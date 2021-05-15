package com.lijin.test;

import com.lijin.domain.Account;
import com.lijin.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test03SpringMabatis {
    @Autowired
    private IAccountService accountService;

    @Test
    public void testFindAll() {
        List list = accountService.findAllAccount();
        System.out.println(list);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName(" 测试账号");
        account.setMoney(1234f);
        accountService.saveAccount(account);
    }
}
