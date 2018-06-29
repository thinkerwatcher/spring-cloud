package com.huateng.wechat;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@ComponentScan
@EnableFeignClients
public class WechatApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(WechatApplication.class).run(args);
	}
}
