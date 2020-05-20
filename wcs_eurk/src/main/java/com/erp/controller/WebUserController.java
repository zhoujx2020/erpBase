package com.erp.controller;

import com.alibaba.druid.util.StringUtils;
import com.erp.entity.CommonResult;
import com.erp.entity.WebUser;
import com.erp.service.WebUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author zjx
 * @version 1.0
 * @date 2020/5/19 23:23:53
 */
@RestController
@RequestMapping("/webUser")
@Slf4j
public class WebUserController {

    @Resource
    private WebUserService webUserService;

    @PostMapping(value = "/add")
    @ResponseBody
//    @ApiOperation(value = "用户添加")
    public CommonResult create(@RequestBody WebUser webUser){
        log.info("准备创建用户："+webUser.toString());
        int result = webUserService.create(webUser);
        log.info("创建用户是否成功："+(result > 0));
        if(result > 0){
            return new CommonResult(200, "创建用户成功", result);
        }else{
            return new CommonResult(444, "创建用户失败", null);
        }
    }

    @PostMapping(value = "/checkUser")
    @ResponseBody
//    @ApiOperation(value = "登录校验")
    public CommonResult checkUser(@RequestBody WebUser webUser){
        if(webUser == null){
            return new CommonResult(208, "输入用户名为空");
        }
        log.info("查询用户是否存在:"+webUser.toString());
        if(StringUtils.isEmpty(webUser.getUserNo())){
            return new CommonResult(203, "用户名为空");
        }
        if(StringUtils.isEmpty(webUser.getPwd())){
            return new CommonResult(204, "密码为空");
        }
        WebUser webUsers = webUserService.queWebUserByNo(webUser.getUserNo());
        log.info("根据用户名查询到的用户："+webUsers.toString());
        if(webUsers == null){
            return new CommonResult(205, "用户名不存在");
        }
        if (webUser.getPwd().equals(webUsers.getPwd())){
            return new CommonResult(200, "登陆成功",webUser);
        }else {
            return new CommonResult(210, "用户名或密码错误");
        }
    }

    @GetMapping(value = "/queUser")
    @ResponseBody
//    @ApiOperation(value = "用户查询")
    public CommonResult getUserById(@RequestParam("id") Long id){
        log.info("查询用户是否存在，用户id："+id);
        if(id == null){
            return new CommonResult(206, "用户id为空");
        }
        WebUser webUser = webUserService.queWebUserById(id);
        log.info("根据用户名查询到的用户："+(webUser == null ? null:webUser.toString()));
        if(webUser == null){
            return new CommonResult(207, "用户id对应用户不存在");
        }
        return new CommonResult(200, "查询成功",webUser);
    }
}
