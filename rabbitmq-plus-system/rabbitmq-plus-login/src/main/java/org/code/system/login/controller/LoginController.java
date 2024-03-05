package org.code.system.login.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.code.system.login.model.LoginModel;
import org.code.system.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangjunlin
 */
@RestController
@RequestMapping("login")
@Tag(name = "登录模块")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Operation(summary = "登录系统")
    @PostMapping("login.do")
    public void login(@RequestBody LoginModel loginModel){
        loginService.login(loginModel);
    }

}
