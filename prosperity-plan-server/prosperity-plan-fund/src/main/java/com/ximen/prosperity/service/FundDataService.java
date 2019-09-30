package com.ximen.prosperity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ximen.prosperity.entity.FundData;
import com.ximen.prosperity.mapper.FundDataMapper;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/21 14:14
 */
@Service
@Transactional
public class FundDataService {

    @Autowired
    private FundDataMapper fundDataMapper;

    /**
     * 添加
     * @param fundData
     * @return
     */
    public void add(FundData fundData) {
        fundDataMapper.insert(fundData);
    }
}
