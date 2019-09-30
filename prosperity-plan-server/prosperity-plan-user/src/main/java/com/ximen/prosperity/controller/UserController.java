package com.ximen.prosperity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ximen.prosperity.base.Result;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/19 19:59
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("login")
    public Result login(){
        return new Result(true,0,"操作成功");
    }
}
