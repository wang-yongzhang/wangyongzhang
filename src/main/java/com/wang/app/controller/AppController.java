package com.wang.app.controller;

import cn.hutool.core.date.DateUtil;
import com.wang.app.model.result.Result;
import com.wang.app.service.AppService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AppController {
    @Resource
    private AppService appService;

    @GetMapping("/ping")
    @CrossOrigin
    public Result<String> ping() {
        return Result.success(DateUtil.now());
    }
}
