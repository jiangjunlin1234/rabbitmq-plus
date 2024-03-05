package org.code.system.agent.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.code.system.agent.controller.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangjunlin
 * @date 2023年12月15日10:04:05
 */
@RestController
@RequestMapping("agent")
@Tag(name = "rabbitmq接口代理")
public class AgentController {

    @Operation(summary = "添加用户",
            description = "根据姓名添加用户并返回",
            parameters = {
                    @Parameter(name = "name", description = "姓名")
            })
    @PostMapping("test")
    public String test(String name) {
        return "aaa";
    }

}
