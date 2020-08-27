package com.jiangfan.springboot09.config;

import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @Auther: 江帆
 * @Date: 2020/7/5
 * @Description: com.jiangfan.springboot09.config
 * @version: 1.0
 */
@MapperScan(basePackages = "com.jiangfan.springboot09.mapper")
@org.springframework.context.annotation.Configuration
public class MybatisConfig {
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        ConfigurationCustomizer configurationCustomizer = new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true); //开启驼峰命名


            }
        };
        return configurationCustomizer;
    }
}
