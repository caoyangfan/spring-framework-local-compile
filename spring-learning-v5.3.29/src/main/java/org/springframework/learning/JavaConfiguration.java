package org.springframework.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

	@Bean
	public User user() {
		User user = new User();
		user.setAge(11);
		user.setUsername("mike uli");
		return user;
	}
}
