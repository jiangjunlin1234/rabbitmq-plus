package org.code.system.login.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author jiangjunlin
 */
@Schema(name = "LoginModel", description = "登录信息字段")
@Data
@AllArgsConstructor
public class LoginModel {

    @Schema(name = "address", description = "服务地址")
    private String address;

    @Schema(name = "port", description = "端口")
    private int port;

    @Schema(name = "username", description = "用户名")
    private String username;

    @Schema(name = "password", description = "密码")
    private String password;

}
