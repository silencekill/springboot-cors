package org.javaboy.cors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置跨域请求
 * 实现WebMvcConfigurer,重写addCorsMappings方法
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 所有的路径添加
        registry.addMapping("/**")
                //允许的哪些请求可以进入
                .allowedOrigins("http://localhost:8081")
                .allowedHeaders("*")
                .allowedMethods("*")
                .maxAge(30*1000);
    }
}
