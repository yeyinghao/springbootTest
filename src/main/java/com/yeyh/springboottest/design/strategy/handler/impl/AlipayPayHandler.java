package com.yeyh.springboottest.design.strategy.handler.impl;

import com.yeyh.springboottest.design.strategy.annotation.PayStrategy;
import com.yeyh.springboottest.design.strategy.enums.PayHandlerType;
import com.yeyh.springboottest.design.strategy.handler.PayHandler;

/**
 * @describe: TODO
 * @author: yeyinghao
 * @date: 2023/5/4 20:26
 */
@PayStrategy(PayHandlerType.ALI_PAY)
public class AlipayPayHandler implements PayHandler {

    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
