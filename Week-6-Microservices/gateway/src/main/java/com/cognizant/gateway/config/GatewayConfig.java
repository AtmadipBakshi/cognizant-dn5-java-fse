package com.cognizant.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;

import static org.springframework.cloud.gateway.server.mvc.filter.BeforeFilterFunctions.uri;
import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;

@Configuration
public class GatewayConfig {

    @Bean
    public RouterFunction<?> gatewayRoutes() {

        RouterFunction<?> accountRoute = route("account-service")
                .GET("/accounts/**", http())
                .before(uri("http://localhost:8080"))
                .build();

        RouterFunction<?> loanRoute = route("loan-service")
                .GET("/loans/**", http())
                .before(uri("http://localhost:8081"))
                .build();

        return accountRoute.andOther(loanRoute);
    }
}