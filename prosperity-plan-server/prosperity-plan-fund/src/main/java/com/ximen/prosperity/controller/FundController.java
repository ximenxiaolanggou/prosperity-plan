package com.ximen.prosperity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ximen.prosperity.base.PageResult;
import com.ximen.prosperity.base.Result;
import com.ximen.prosperity.entity.FundList;
import com.ximen.prosperity.service.FundService;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/20 15:59
 */
@RestController
@RequestMapping("fund")
public class FundController {

    @Autowired
    private FundService fundService;

    /**
     * 分页
     * @return
     */
    @PostMapping("page/{pageNumber}/{pageSize}")
    public Result page(@PathVariable("pageNumber") Integer pageNumber,@PathVariable("pageSize") Integer pageSize,@RequestBody(required = false) FundList fundList){
        PageResult page = fundService.page(pageNumber, pageSize, fundList);
        return new Result(true,0,"操作成功",page);
    }

    /**
     * 添加
     * @param fundList
     * @return
     */
    @PostMapping("add")
    public Result add(@RequestBody FundList fundList){
        fundService.add(fundList);
        return new Result(true,0,"添加成功");
    }

    /**
     * 根据ID查询基金
     * @param id
     * @return
     */
    @GetMapping("findFundById/{id}")
    public Result findFundById(@PathVariable("id") String id){
        FundList fundList = fundService.findFundById(id);
        return new Result(true,0,"操作成功",fundList);
    }

    /**
     * 跟新
     * @param fundList
     * @return
     */
    @PutMapping("update")
    public Result update(@RequestBody FundList fundList){
        fundService.update(fundList);
        return new Result(true,0,"操作成功");
    }
}
