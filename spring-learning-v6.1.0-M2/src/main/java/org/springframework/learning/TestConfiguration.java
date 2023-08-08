package org.springframework.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

	@Bean
	public User user() {
		User user = new User();
		user.setUsername("Alex v6.1.0-M2 用户名中文乱码测试");
		user.setAge(22);
		user.setSex("男");
		user.setWeight(68);
		user.setHeight(182);
		return user;
	}
}
