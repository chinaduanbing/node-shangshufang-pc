package com.lm.web.controller;

import com.shangshufang.longmarchservice.api.dto.TestDto;
import com.shangshufang.longmarchservice.api.request.TestRequest;
import com.shangshufang.longmarchservice.api.service.TestService;
import com.shangshufang.redisService.api.service.TestRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

//    @Autowired
//    private TestService testService;
    @Autowired
    private TestRedisService testRedisService;

    /**
     * @return
     */
    @RequestMapping("/findById")
    public TestDto findById () {
        String name = "test";
        TestRequest testRequest = new TestRequest();
        testRequest.setManageName(name);
        TestDto testDto = new TestDto();
//        for(int i=1;i<1000;i++){
//            testDto = testService.test(testRequest);
//            System.out.println(testDto.getReceiveName());
//        }

        return testDto;
    }

    @RequestMapping("/test")
    public String test(){
        String name = testRedisService.test("test");
        System.out.println(name);
        return  name;
    }

}
