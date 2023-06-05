package com.yeyh.springboottest.design.strategy.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @describe: TODO
 * @author: yeyinghao
 * @date: 2023/5/4 20:30
 */
@AllArgsConstructor
@Getter
public enum PayHandlerType {

    ALI_PAY("ALI_PAY", "支付宝"),
    WEI_XIN("WEI_XIN", "微信"),

    ;

    private final String code;

    private final String name;
}
