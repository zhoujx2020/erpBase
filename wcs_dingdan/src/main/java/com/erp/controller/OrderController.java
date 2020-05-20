package com.erp.controller;

import com.alibaba.druid.util.StringUtils;
import com.erp.entity.CommonResult;
import com.erp.entity.WebUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zjx
 * @version 1.0
 * @date 2020/5/20 23:36:15
 */
@RestController
@RequestMapping("/consumer/webUser")
@Slf4j
public class OrderController {

    public static final String url = "http://localhost:9999/webUser";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public CommonResult create(@RequestBody WebUser webUser){
        return restTemplate.postForObject(url + "/add", webUser, CommonResult.class);
    }

    @PostMapping(value = "/checkUser")
    @ResponseBody
//    @ApiOperation(value = "登录校验")
    public CommonResult checkUser(@RequestBody WebUser webUser){
        return restTemplate.postForObject(url + "/checkUser", webUser, CommonResult.class);
    }

    @GetMapping(value = "/queUser")
    @ResponseBody
//    @ApiOperation(value = "用户查询")
    public CommonResult getUserById(@RequestParam("id") Long id){
        return restTemplate.getForObject(url + "/checkUser?id="+id, CommonResult.class);
    }

}
