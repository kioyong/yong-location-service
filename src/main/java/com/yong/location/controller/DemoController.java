package com.yong.location.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @acthor yong.a.liang
 * @date 2018/03/12
 */
@RestController
public class DemoController {

    private AtomicLong atomicLong = new AtomicLong();


    @GetMapping()
    public String getLocation() {
        return "GuangZhou";
    }

    @GetMapping("/count")
    public Long getCount() {
        return atomicLong.getAndIncrement();
    }
}
