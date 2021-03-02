package com.benetech.feign.example.spring.cloud.nacos.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 季舟
 * @copyright 上海智赢健康科技有限公司
 * @since 2021/3/2 12:20
 */
@FeignClient("benetech-nacos-provider-example")
public interface EchoFeignService {

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    String echo(@PathVariable("string") String string);

}
