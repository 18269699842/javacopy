package com.spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by chenhuan on 16-4-7.
 */
@Configuration
@ComponentScan("com.spring4.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
