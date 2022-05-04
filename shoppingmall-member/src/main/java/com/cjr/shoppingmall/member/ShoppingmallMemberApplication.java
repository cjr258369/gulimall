package com.cjr.shoppingmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 1. 想要远程调用别的服务
 * 1） 引入 open-feign
 * 2）  编写一个接口， 告诉 springCloud 这个接口需要调用远程
 *      1、声明接口的每一个方法，都是调用那哪个远程服务的哪个请求
 * 3） 开启远程调用功能： @EnableFeignClients，并指定扫描的包，就是哪些包会执行远程调用，所以所有含有远程调用的都放在统一的类包下
 */

@EnableFeignClients(basePackages = "com.cjr.shoppingmall.member.feign")
@EnableDiscoveryClient
@MapperScan("com.cjr.shoppingmall.member.dao")
@SpringBootApplication
public class ShoppingmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingmallMemberApplication.class, args);
    }

}
