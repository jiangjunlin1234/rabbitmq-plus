//package org.code.system.framework.swagger;
//
//import io.swagger.v3.oas.models.info.License;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import org.springdoc.core.models.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author jiangjunlin
// */
//@Configuration
//public class Knife4jConfig {
//    @Bean
//    public GroupedOpenApi adminApi() {
//        return GroupedOpenApi.builder()
//                // 分组名称
//                .group("admin-api")
//                // 接口请求路径规则
//                .pathsToMatch("/admin/**")
//                // 创建了一个api接口的分组
//                .build();
//    }
//
//    @Bean
//    public OpenAPI openAPI() {
//        return new OpenAPI()
//                .info(new Info()
//                        .title("Knife4j标题")
//                        .description("Knife4j说明")
//                        .version("v1")
//                        .contact(new Contact().name("robin").email("robin@gmail.com"))
//                        .license(new License().name("Apache 2.0").url("http://springdoc.org"))
//                );
//
//    }
//}
