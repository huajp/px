package com.clr.common.config;


import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

/**
     *  @author: pjinhua
     *  @Date: 2019/4/1 10:56
     *  @Description:
     *   扫描classpath 下的 *mapping.xml文件 支持多级扫描
     *
     */
     
    @Configuration
    public class DozerConfig {
        @Bean
        public DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean(@Value("classpath*:dozer/**/*.xml") Resource[] resources) throws Exception {
            final DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean = new DozerBeanMapperFactoryBean();
            dozerBeanMapperFactoryBean.setMappingFiles(resources);
            return dozerBeanMapperFactoryBean;
        }
    }