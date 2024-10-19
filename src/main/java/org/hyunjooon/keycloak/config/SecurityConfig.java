package org.hyunjooon.keycloak.config;

import org.hyunjooon.keycloak.filter.CustomSecurityFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeHttpRequests(a -> a.anyRequest().authenticated())
                .addFilterAfter(new CustomSecurityFilter(), BasicAuthenticationFilter.class);

        return httpSecurity.build();
    }
}
