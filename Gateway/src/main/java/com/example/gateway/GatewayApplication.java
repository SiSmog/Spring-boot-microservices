package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	@Bean
	RouteLocator routeLocator(RouteLocatorBuilder builder)
	{
		return builder.routes()
				.route(r->r.path("/membre").uri("lb://membre-service"))
				.route(r->r.path("/publications/**").uri("lb://PUBLICATION-SERVICE"))
				.route(r->r.path("/evenements/**").uri("lb://EVENEMENT-SERVICE"))
		.build();
	}
}
