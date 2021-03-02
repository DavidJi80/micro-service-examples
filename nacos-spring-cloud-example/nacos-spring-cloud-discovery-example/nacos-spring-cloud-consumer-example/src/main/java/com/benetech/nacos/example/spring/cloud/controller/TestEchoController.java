package com.benetech.nacos.example.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 季舟
 * @copyright 上海智赢健康科技有限公司
 * @since 2021/3/1 18:02
 */
@RestController
public class TestEchoController {
    private final RestTemplate restTemplate;

    @Autowired
    public TestEchoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://benetech-service-provider-example/echo/" + str, String.class);
    }
}
