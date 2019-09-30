package com.ximen.prosperity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/20 15:31
 */
@SpringBootApplication
@EnableEurekaClient
public class Prosperity_Fund_App {
    public static void main(String[] args) {
        SpringApplication.run(Prosperity_Fund_App.class,args);
    }
}
