package com.cjr.shoppingmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author chenjunran
 * @date 2022/5/24
 */
@Configuration
public class shoppingmallCorsConfiguration {

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        // config 配置所有跨域相关的信息, * 代表所有
        //允许哪些头跨域
        config.addAllowedHeader("*");
        //允许哪些请求方式跨域
        config.addAllowedMethod("*");
        //允许哪些请求来源跨域：如果使用  config.addAllowedOrigin("*")  与 config.setAllowCredentials(true) 时，则有可能请求时发生如下提示：
        //When allowCredentials is true, allowedOrigins cannot contain the special value "*" since that cannot be set on the "Access-Control-Allow-Origin" response header.
        //To allow credentials to a set of origins, list them explicitly or consider using "allowedOriginPatterns" instead.
        //config.addAllowedOrigin("*");
        //因此需要替换为：addAllowedOriginPattern("*");
        config.addAllowedOriginPattern("*");
        //是否允许 cookies 跨域，如果不配置那么跨域就会丢失 cookies 信息
        config.setAllowCredentials(true);

        // "/**" 表示任意路径都要进行跨域配置
        source.registerCorsConfiguration("/**", config);
        return new CorsWebFilter(source);
    }
}
