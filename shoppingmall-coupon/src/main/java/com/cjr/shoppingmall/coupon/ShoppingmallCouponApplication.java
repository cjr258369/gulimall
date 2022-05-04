package com.cjr.shoppingmall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShoppingmallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingmallCouponApplication.class, args);
    }

}
