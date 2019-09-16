package com.ximen.prosperity.service;

import java.util.ArrayList;
import java.util.List;

import com.ximen.prosperity.entity.Dept;
import org.springframework.stereotype.Component;
import feign.hystrix.FallbackFactory;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/4 20:05
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptService> {
    @Override
    public DeptService create(Throwable cause) {
        return new DeptService() {
            @Override
            public List<Dept> list() {
                List<Dept> list = new ArrayList<>();
                Dept dept = new Dept();
                dept.setDeptno(1L);
                dept.setDname("服务关闭请稍后再试");
                list.add(dept);
                return list;
            }
        };
    }
}
