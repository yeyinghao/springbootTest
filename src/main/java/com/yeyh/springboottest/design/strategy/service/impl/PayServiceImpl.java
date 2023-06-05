package com.yeyh.springboottest.design.strategy.service.impl;

import com.yeyh.springboottest.design.strategy.annotation.PayStrategy;
import com.yeyh.springboottest.design.strategy.enums.PayHandlerType;
import com.yeyh.springboottest.design.strategy.handler.PayHandler;
import com.yeyh.springboottest.design.strategy.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @describe: TODO
 * @author: yeyinghao
 * @date: 2023/5/4 20:34
 */
@Service
public class PayServiceImpl implements PayService {

    private Map<PayHandlerType, PayHandler> payHandlerMap;

    private final List<PayHandler> payHandlers;

    public PayServiceImpl(List<PayHandler> payHandlers) {
        this.payHandlers = payHandlers;
    }

    @PostConstruct
    private void init() {
        payHandlerMap = payHandlers.stream().collect(Collectors.toMap(
                // 获取策略标识
                item -> item.getClass().getAnnotation(PayStrategy.class).value(), item -> item));
    }

    @Override
    public void pay() {
        payHandlerMap.get(PayHandlerType.ALI_PAY).pay();
        payHandlerMap.get(PayHandlerType.WEI_XIN).pay();
    }
}
