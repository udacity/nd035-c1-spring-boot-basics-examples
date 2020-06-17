package com.udacity.jwdnd.c1.snippets.l2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BadConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }

}

