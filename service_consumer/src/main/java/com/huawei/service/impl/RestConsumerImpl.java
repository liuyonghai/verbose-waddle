package com.huawei.service.impl;

import com.huawei.service.RestInterface;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestConsumerImpl implements RestInterface {
    private final RestTemplate restTemplate= RestTemplateBuilder.create();
    @Override
    public String sayRest(String name) {
        String ss=restTemplate.getForObject("cse://provider/hello/hello?name=你大爷的打印",String.class);
        return ss;
    }
}
