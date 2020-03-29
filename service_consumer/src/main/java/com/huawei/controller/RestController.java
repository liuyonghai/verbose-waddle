package com.huawei.controller;


import com.huawei.service.RestInterface;
import com.huawei.service.impl.RestConsumerImpl;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "test")
@RequestMapping("/test")
public class RestController implements RestInterface {
    @Autowired
    private RestConsumerImpl restConsumer;

    @Override
    @GetMapping("/test")
    public String sayRest(String name) {
        return restConsumer.sayRest(name);
    }
}
