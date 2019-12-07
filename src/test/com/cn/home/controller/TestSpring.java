package com.cn.home.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zhangjixu
 * @CreateDate: 2019/12/7
 * @Description:
 * @Version: 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:springmvc-servlet.xml"})
public class TestSpring {

    @Autowired
    private TestController testController;

    @Test
    public void test() {
        System.out.println(testController.test());
    }

}
