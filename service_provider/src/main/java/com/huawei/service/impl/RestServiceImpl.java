package com.huawei.service.impl;

import com.huawei.service.RestInterface;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "hello")
@RequestMapping("/hello")
public class RestServiceImpl implements RestInterface {
    @Override
    @GetMapping("hello")
    public String sayRest(String name) {
        return "你大爷，你大爷"+name;
    }
}
