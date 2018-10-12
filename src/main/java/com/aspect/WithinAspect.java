package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WithinAspect {

//    @Pointcut("within(com.service.AnnotationAopService))")
//    public void withinMatch() {
//
//    }

    @Pointcut("within(com.service.sub.*))")
    public void withinMatch() {

    }

    @Before("withinMatch()")
    public void before() {
        System.out.println("within before");
    }
}
