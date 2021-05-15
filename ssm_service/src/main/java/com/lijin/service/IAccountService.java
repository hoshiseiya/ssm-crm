package com.lijin.service;

import com.lijin.domain.Account;

import java.util.List;

public interface IAccountService {

    /*** 保存账户 * @param account */
    void saveAccount(Account account);

    /*** 查询所有账户 * @return */
    List<Account> findAllAccount();
}
