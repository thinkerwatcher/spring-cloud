package com.huateng.wechat.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="user-server")
public interface UserClient {

	@RequestMapping(value="/user/getName",method = RequestMethod.POST)
	String getUserName();
}
