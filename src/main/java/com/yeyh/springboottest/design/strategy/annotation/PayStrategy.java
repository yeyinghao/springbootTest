package com.yeyh.springboottest.design.strategy.annotation;

import com.yeyh.springboottest.design.strategy.enums.PayHandlerType;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @describe: TODO
 * @author: yeyinghao
 * @date: 2023/5/4 20:27
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface PayStrategy {
    PayHandlerType value();
}
