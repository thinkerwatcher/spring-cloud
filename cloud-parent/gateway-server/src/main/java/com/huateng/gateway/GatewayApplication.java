package com.huateng.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableZuulProxy
@SpringCloudApplication
@RestController
@ComponentScan
public class GatewayApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(GatewayApplication.class).run(args);
	}
	
	@Autowired
	private Environment env;
	@RequestMapping("/getName")
	public String getName() {
		return env.getProperty("server.name");
	}
}
