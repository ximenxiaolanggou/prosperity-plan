package com.ximen.prosperity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/16 20:50
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class Prosperity_Server_App {
    public static void main(String[] args) {
        SpringApplication.run(Prosperity_Server_App.class);
    }

}
