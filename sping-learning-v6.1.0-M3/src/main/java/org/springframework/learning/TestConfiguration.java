package org.springframework.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

	@Bean
	public User user() {
		User user = new User();
		user.setUsername("Alex");
		user.setAge(22);
		user.setSex("男");
		user.setWeight(68);
		user.setHeight(182);
		return user;
	}

}