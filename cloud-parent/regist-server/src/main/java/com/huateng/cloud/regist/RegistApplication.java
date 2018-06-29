package com.huateng.cloud.regist;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringCloudApplication
public class RegistApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(RegistApplication.class).run(args);
	}
}
