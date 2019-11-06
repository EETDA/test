package com.qf.service;

import com.qf.entity.Account;

import java.util.List;

public interface AccountService {
    //查询所有
    public List<Account> findAll();

    //保存账户
    public void saveAccount(Account account);
}
