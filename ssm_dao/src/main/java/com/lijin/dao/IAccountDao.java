package com.lijin.dao;

import com.lijin.domain.Account;
import java.util.List;

public interface IAccountDao {
    /*** 保存 * @param account */
//    @Insert("insert into account values(null,#{name},#{money})")
    void save(Account account);

    /*** 查询所有 * @return */
//    @Select("select * from account")
    List<Account> findAll();
}
