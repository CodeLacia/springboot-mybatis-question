package com.hao.ums.controller;

import com.hao.ums.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import com.hao.ums.base.BaseController;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ums/account")
public class AccountController extends BaseController {

    //将DAO注入Service层
    @Autowired
    private AccountService accountService;

    @ApiOperation(value="获取用户列表")
    @GetMapping("/get")
    public Object getAccounts() {
        return success(accountService.getOne());
    }

    @ApiOperation(value="连接测试")
    @GetMapping("/connect")
    public String testConnect() {
        String a = "connect";
        return a;
    }
}
