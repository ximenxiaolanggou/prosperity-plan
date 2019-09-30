package com.ximen.prosperity.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/21 14:09
 */
@TableName
@Data
public class FundData {
    @TableId(type = IdType.UUID)
    private String uuid;

    /**
     * 数据
     */
    private Double data;

    /**
     * 日期
     */
    private Date dataDate;

    /**
     * 基金ID
     */
    private Integer fundId;
}
