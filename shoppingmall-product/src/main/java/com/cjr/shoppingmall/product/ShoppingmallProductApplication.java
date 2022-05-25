package com.cjr.shoppingmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、整合 MyBatis-Plus
 *   1.1 导入依赖（已经在common里面导入了）
 *   1.2 配置，根据官方的来配置： https://baomidou.com/pages/3b5af0/
     *   1.2.1 配置数据源
        *   1.2.1.1 导入数据库驱动（直接写到 common 里面）
        *   1.2.1.2 在 application.yml 里面配置数据库连接的相关信息
     *   1.2.2 配置MyBatis-plus 相关的信息
        *   1.2.2.1 配置 mapperscan，指定 mapper 的扫描路径
        *   1.2.2.2 告诉 MyBatis-plus sql映射的mapper.xml 文件位置，配置到 application.yml
        *   1.2.2.3 配置主键递增，配置到 application.yml，把 ...db-config.id-type: auto 配置为 auto，后面数据量大了，需要分库分表了，再修改为其他
 *
 */
@EnableDiscoveryClient
@MapperScan("com.cjr.shoppingmall.product.dao")
@SpringBootApplication
public class ShoppingmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingmallProductApplication.class, args);
    }

}
