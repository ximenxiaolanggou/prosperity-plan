package com.ximen.prosperity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ximen.prosperity.base.Result;
import com.ximen.prosperity.entity.FundData;
import com.ximen.prosperity.service.FundDataService;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/21 14:08
 */
@RestController
@RequestMapping("funddata")
public class FundDataController {

    @Autowired
    private FundDataService fundDataService;

    /**
     * 添加
     * @param fundData
     * @return
     */
    @PostMapping("add")
    public Result add(@RequestBody FundData fundData){
        fundDataService.add(fundData);
        return new Result(true,0,"操作成功");
    }
}
