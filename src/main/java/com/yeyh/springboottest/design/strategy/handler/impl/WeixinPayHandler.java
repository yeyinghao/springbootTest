package com.yeyh.springboottest.design.strategy.handler.impl;

import com.yeyh.springboottest.design.strategy.annotation.PayStrategy;
import com.yeyh.springboottest.design.strategy.enums.PayHandlerType;
import com.yeyh.springboottest.design.strategy.handler.PayHandler;

/**
 * @describe: TODO
 * @author: yeyinghao
 * @date: 2023/5/4 20:26
 */
@PayStrategy(PayHandlerType.WEI_XIN)
public class WeixinPayHandler implements PayHandler {

    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
