package com.matrix.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfigDemo {

    @Bean
    public Operations getOperations() {
        return new Operations();
    }
}
