package com.udacity.jwdnd.spring_security_basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan("com.udacity.jwdnd.spring_security_basics.mapper")
public class SpringSecurityBasicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityBasicsApplication.class, args);
    }

}
