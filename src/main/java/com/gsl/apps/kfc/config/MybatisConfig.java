package com.gsl.apps.kfc.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.lbt.apps.kfc.mapper")
public class MybatisConfig {

}
