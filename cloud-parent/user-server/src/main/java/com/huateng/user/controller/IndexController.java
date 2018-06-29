package com.huateng.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class IndexController {
	
	@Autowired
	private Environment env;

	@RequestMapping("/getName")
	public String getName() {
		return env.getProperty("user.name");
	}
}
