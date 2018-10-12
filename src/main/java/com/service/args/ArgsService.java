package com.service.args;

import org.springframework.stereotype.Component;

@Component
public class ArgsService {

    public void find(Long id) {
        System.out.println("find by id");
    }

    public void find(Long id, String name) {
        System.out.println("find by id and name");
    }
}
