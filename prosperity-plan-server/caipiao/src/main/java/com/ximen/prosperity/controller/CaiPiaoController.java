package com.ximen.prosperity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/16 20:51
 */
@RestController
@RequestMapping("caipiao")
public class CaiPiaoController {
    @RequestMapping("getCaipiao")
    public String getCaipiao(){
        return "中奖啦";
    }
}
