package com;

import com.service.AnnotationAopService;
import com.service.sub.SubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationAopTest {

    @Autowired
    private AnnotationAopService annotationAopService;

    @Autowired
    private SubService subService;

    @Test
    public void annotationTest() {
        subService.test1();
        annotationAopService.test1();
    }
}
