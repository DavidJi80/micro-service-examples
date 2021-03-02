package com.benetech.feign.example.spring.cloud.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 季舟
 * @copyright 上海智赢健康科技有限公司
 * @since 2021/3/2 11:42
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosFeignConsumerApplication.class, args);
    }

}
