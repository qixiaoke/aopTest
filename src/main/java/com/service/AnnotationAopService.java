package com.service;

import com.AdminOnly;
import org.springframework.stereotype.Service;

@Service
public class AnnotationAopService {

    @AdminOnly
    public void test1() {
        System.out.println("test1");
    }
}
