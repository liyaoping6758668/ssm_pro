package com.ping.service.impl;

import com.ping.dao.AccountDao;
import com.ping.domain.Account;
import com.ping.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:lyp
 * @date 2020/2/5-11:59
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("service层查询所有");
        List<Account> accountDaoAll = accountDao.findAll();
        return accountDaoAll;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.println("service层保存用户账户信息");

    }
}
