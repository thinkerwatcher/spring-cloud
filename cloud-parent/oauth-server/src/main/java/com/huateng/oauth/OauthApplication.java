package com.huateng.oauth;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringCloudApplication
@EnableFeignClients
@ComponentScan
@EnableDiscoveryClient
public class OauthApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		new SpringApplicationBuilder(OauthApplication.class).run(args);
	}
	
	 @Override
	 public void addViewControllers(ViewControllerRegistry registry) {
		 registry.addViewController("/login").setViewName("login");
		 registry.addViewController("/oauth/confirm_access").setViewName("authorize");
	 }
}
