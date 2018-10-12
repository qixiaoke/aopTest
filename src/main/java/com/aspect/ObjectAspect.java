package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ObjectAspect {

    @Pointcut("this(com.service.log.Loggable)")
    public void objectMatch() {

    }

//    @Pointcut("target(com.service.log.Loggable)")
//    public void objectMatch() {
//
//    }

//    @Pointcut("bean(logService)")
//    public void objectMatch() {
//
//    }

    @Before("objectMatch()")
    public void before() {
        System.out.println("objectAspect before");
    }
}
