package com.ping.test;

import com.ping.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:lyp
 * @date 2020/2/5-19:41
 */
public class TestDemo {

    /**
     * 测试整合spring和mybatis框架
     */
    @Test
    public void testSpring(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        System.out.println(accountService.findAll());

    }
}
