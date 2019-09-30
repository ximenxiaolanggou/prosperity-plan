package com.ximen.prosperity.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/20 15:44
 */
@Data
@TableName(value = "fund_list")
public class FundList {
    @TableId(type = IdType.UUID)
    private String uuid;

    /**
     * 基金名称
     */
    private String name;

    /**
     * 基金编号
     */
    private String number;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date createtime;
}
