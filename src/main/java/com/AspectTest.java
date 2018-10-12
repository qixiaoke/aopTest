package com;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTest {

    @Autowired
    private Anno anno;

    @Pointcut("@annotation(com.service.AdminOnly)")
    public void anno() {

    };

    @Before("anno()")
    public void check() {
        anno.check();
    }
}
