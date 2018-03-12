package com.yong.location.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @acthor yong.a.liang
 * @date 2018/03/12
 */
@RestController
public class DemoController {

    @GetMapping
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/location")
    public String getLocation(){
        return "GuangZhou";
    }
}
