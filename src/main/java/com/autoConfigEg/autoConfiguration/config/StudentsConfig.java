package com.autoConfigEg.autoConfiguration.config;

import com.autoConfigEg.autoConfiguration.Model.College;
import com.autoConfigEg.autoConfiguration.Model.School;
import com.autoConfigEg.autoConfiguration.Model.Students;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AutoConfiguration
//@ConditionalOnClass(name = "com.autoConfigEg.autoConfiguration.Model.College")
@ConditionalOnClass(value = College.class)
public class StudentsConfig {

//    @ConditionalOnBean(name = "com.autoConfigEg.autoConfiguration.Model.School")
    @ConditionalOnBean(value = School.class)
    @Bean
    public Students students(){
        return new Students();
    }
}
