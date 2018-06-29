package com.huateng.user;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@EnableFeignClients
@ComponentScan
public class UserApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(UserApplication.class).run(args);
	}
}
