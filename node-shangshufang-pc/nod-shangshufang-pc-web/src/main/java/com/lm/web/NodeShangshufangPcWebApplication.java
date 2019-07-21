package com.lm.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-customer.xml"})
public class NodeShangshufangPcWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NodeShangshufangPcWebApplication.class, args);
    }

}
