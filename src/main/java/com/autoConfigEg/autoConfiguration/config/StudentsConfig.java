package com.autoConfigEg.autoConfiguration.config;

import com.autoConfigEg.autoConfiguration.Model.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentsConfig {

    @Bean
    public Students students(){
        return new Students();
    }
}
