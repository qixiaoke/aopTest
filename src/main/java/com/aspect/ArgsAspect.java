package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ArgsAspect {

//    @Pointcut("args(Long) && within(com.service.args.*)")
//    public void argsMatch() {
//
//    }

    @Pointcut("args(Long, ..) && within(com.service.args.*)")
    public void argsMatch() {

    }

//    @Pointcut("args(Long, String) && within(com.service.args.*)")
//    public void argsMatch() {
//
//    }

    @Before("argsMatch()")
    public void before() {
        System.out.println("args before");
    }
}
