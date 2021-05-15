package com.lijin.service.impl;

import com.lijin.dao.IAccountDao;
import com.lijin.domain.Account;
import com.lijin.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class IAccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    public void saveAccount(Account account) {
        accountDao.save(account);
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAll();
    }
}
