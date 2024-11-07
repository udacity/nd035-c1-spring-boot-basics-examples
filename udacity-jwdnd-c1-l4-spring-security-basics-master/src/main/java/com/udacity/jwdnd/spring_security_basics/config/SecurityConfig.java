package com.udacity.jwdnd.spring_security_basics.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.udacity.jwdnd.spring_security_basics.service.AuthenticationService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    final private AuthenticationService authenticationService;

    public SecurityConfig(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       

        http
        .authorizeHttpRequests(requests -> requests
            .requestMatchers("/signup", "/css/**", "/js/**").permitAll()
            .anyRequest().authenticated()
        )
        

        .formLogin(formLogin -> 
            formLogin.loginPage("/login")
                     .permitAll()
                     .defaultSuccessUrl("/home", true)
        )
        .authenticationProvider(authenticationService);

    return http.build();

    }


}
