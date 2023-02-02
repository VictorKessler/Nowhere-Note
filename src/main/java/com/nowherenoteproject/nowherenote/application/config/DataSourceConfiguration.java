package com.nowherenoteproject.nowherenote.application.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.quartz.QuartzDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
@EnableAutoConfiguration
public class DataSourceConfiguration {
    @Bean
    @QuartzDataSource
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .build();
    }
}