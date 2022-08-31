package com.shop.mybatis.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.shop.mybatis.core.handler.DefaultDBFieldHandler;
import com.shop.mybatis.core.injector.CustomerSqlInjector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Date: 2022/5/1 19:41
 * @Description: 自动装配
 * @Version 1.0.0
 */
@Configuration
@MapperScan("")
public class MybatisPlusAutoConfiguration {

    /**
     * 分页插件
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        // 分页插件
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        // 乐观锁插件
        mybatisPlusInterceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return mybatisPlusInterceptor;
    }

    /**
     * 自动填充字段
     * @return
     */
    @Bean
    public DefaultDBFieldHandler defaultDBFieldHandler() {
        return new DefaultDBFieldHandler();
    }

    /**
     * 自定义SQL扩展器
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(CustomerSqlInjector.class)
    public CustomerSqlInjector customerSqlInjector() {
        return new CustomerSqlInjector();
    }

}
