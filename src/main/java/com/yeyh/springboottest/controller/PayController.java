package com.yeyh.springboottest.controller;

import com.yeyh.springboottest.design.strategy.annotation.PayStrategy;
import com.yeyh.springboottest.design.strategy.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @describe: TODO
 * @author: yeyinghao
 * @date: 2023/5/4 20:41
 */
@RestController
@RequestMapping("/api")
public class PayController {

    @Autowired
    private PayService payService;

    @GetMapping("/pay")
    public boolean pay(){
        payService.pay();
        return true;
    }

}
