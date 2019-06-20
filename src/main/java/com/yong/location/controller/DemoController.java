package com.yong.location.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @acthor yong.a.liang
 * @date 2018/03/12
 */
@RestController
public class DemoController {

    private int count = 0;


    @GetMapping()
    public String getLocation() {
        return "GuangZhou";
    }

    @GetMapping("/count")
    public Integer getCount() {
        return count++;
    }
}
