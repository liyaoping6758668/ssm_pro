package com.ping.service;

import com.ping.domain.Account;

import java.util.List;

/**
 * @author:lyp
 * @date 2020/2/5-11:47
 */
public interface AccountService  {
    /**
     * 查询所有账户信息
     */
    List<Account> findAll();

    /**
     * 保存账户信息
     */
    void saveAccount(Account account);
}
