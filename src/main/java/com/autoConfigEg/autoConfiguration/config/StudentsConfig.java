package com.autoConfigEg.autoConfiguration.config;

import com.autoConfigEg.autoConfiguration.Model.Students;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AutoConfiguration
public class StudentsConfig {

    @Bean
    public Students students(){
        return new Students();
    }
}
