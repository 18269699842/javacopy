package com.spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Prototype Bean
 * Created by chenhuan on 16-4-9.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
