package com.ximen.prosperity.service;

import java.util.List;

import com.ximen.prosperity.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author ZhiShun.Cai
 * @Date 2019/9/4 17:09
 */
@FeignClient(value = "microservercloud-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptService {

    @RequestMapping("/dept/list")
    public List<Dept> list();
}
