package com.clientui.clientui.configurations;

import com.clientui.clientui.exceptions.CustomErrorDecodeur;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignExceptionConfig {

    @Bean
    public CustomErrorDecodeur mCustomErrorDecodeur(){
        return new CustomErrorDecodeur();
    }
}
