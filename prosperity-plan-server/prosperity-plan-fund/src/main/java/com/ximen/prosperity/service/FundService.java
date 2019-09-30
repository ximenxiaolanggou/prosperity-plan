package com.ximen.prosperity.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ximen.prosperity.base.PageResult;
import com.ximen.prosperity.entity.FundList;
import com.ximen.prosperity.mapper.FundMapper;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/20 16:00
 */
@Service
@Transactional
public class FundService {
    @Autowired
    private FundMapper fundMapper;

    /**
     * 分页
     * @return
     */
    public PageResult page(Integer pageNumber, Integer pageSize, FundList fundList){
        IPage<FundList> page = fundMapper.selectPage(new Page<FundList>(pageNumber, pageSize), null);
        return new PageResult(page.getTotal(),page.getRecords());
    }

    /**
     * 添加
     * @param fundList
     * @return
     */
    public void add(FundList fundList) {
        fundList.setCreatetime(new Date());
        fundMapper.insert(fundList);
    }

    /**
     * 根据ID查询基金
     * @param id
     * @return
     */
    public FundList findFundById(String id) {
        return fundMapper.selectById(id);
    }

    /**
     * 跟新
     * @param fundList
     * @return
     */
    public void update(FundList fundList) {
        fundMapper.updateById(fundList);
    }
}
