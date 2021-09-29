package com.hao.ums.controller;

import com.hao.ums.bean.DailyNote;
import com.hao.ums.bean.UserBean;
import com.hao.ums.mapper.DaliynoteMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.hao.ums.service.UserService;
import com.hao.ums.base.BaseController;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nms")
public class DailyNoteController extends BaseController {

    @Autowired
    private UserService userService;

    @Autowired
    private DaliynoteMapper dailynoteMapper;

    @ApiOperation(value="连接测试")
    @GetMapping("/submit")
    public Object submitNote(DailyNote d) {
        dailynoteMapper.addNewDailyNote(d);
        return success();
    }

    @ApiOperation(value="连接测试")
    @GetMapping("/connect")
    public String testConnect() {
        String a = "connect";
        return a;
    }
    @ApiOperation(value="获取人信息")
    @PostMapping("/loginuser")
    public UserBean materialOutList() {
        UserBean a = null;
        return a;
    }
}
