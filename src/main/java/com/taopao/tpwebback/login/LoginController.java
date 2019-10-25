package com.taopao.tpwebback.login;

import com.taopao.tpwebback.bean.UserInfo;
import com.taopao.tpwebback.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(tags = "登陆/注册")
@Controller
public class LoginController {
    @Autowired
    private UserService mUserService;

    //此注解对接口的说明
    @ApiOperation("登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "account", value = "账号", required = true, paramType = "string"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "string"),
    })
    @RequestMapping(value = "/api/v1/login", method = {RequestMethod.POST})
    @ResponseBody
    public UserInfo login(String account, String password) {
        return mUserService.get(1);
    }
}

