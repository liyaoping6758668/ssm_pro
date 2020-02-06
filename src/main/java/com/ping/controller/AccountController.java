package com.ping.controller;

import com.ping.domain.Account;
import com.ping.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author:lyp
 * @date 2020/2/5-18:24
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有的数据
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model) {
        List<Account> accountServiceAll = accountService.findAll();
        model.addAttribute("list",accountServiceAll);
        System.out.println("表现层：查询所有账户...");
        return "list";
    }

    /**
     * 保存
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }

}
