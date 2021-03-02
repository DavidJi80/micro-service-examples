package com.benetech.feign.example.spring.cloud.nacos.controller;

import com.benetech.feign.example.spring.cloud.nacos.feign.EchoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 季舟
 * @copyright 上海智赢健康科技有限公司
 * @since 2021/3/2 12:26
 */
@RestController
public class EchoFeignController {

    @Autowired
    private EchoFeignService echoFeignService;

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return echoFeignService.echo(str);
    }
}
