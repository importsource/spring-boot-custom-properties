package com.importsource.spring.boot;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hezhuofan
 */
@Configuration
@EnableConfigurationProperties(CustomProperties.class)
public class CustomAutoConfiguration {
    @Bean
    Person person(CustomProperties properties){
        return new Person(properties);
    }
}

class Person{
    private CustomProperties properties;

    Person(CustomProperties properties) {
       this.properties=properties;
        System.out.println(properties);
    }
}
