package com.huateng.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huateng.wechat.feign.UserClient;

@RestController
@RequestMapping("/wechat")
public class IndexController {
	
	@Autowired
	private UserClient userClient;

	@RequestMapping("/getUserName")
	public String getUser() {
		return userClient.getUserName();
	}
}
