package com.cn.home.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangjixu
 * @CreateDate: 2019/12/7
 * @Description:
 * @Version: 1.0.0
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test", produces = "application/json; charset=utf-8", method = RequestMethod.GET)
    public Object test() {
        return "success";
    }

}
