package com.ximen.prosperity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/16 19:59
 */
@SpringBootApplication
@EnableEurekaServer
public class Prosperity_Eureka_App {
    public static void main(String[] args) {
        SpringApplication.run(Prosperity_Eureka_App.class,args);
    }
}
