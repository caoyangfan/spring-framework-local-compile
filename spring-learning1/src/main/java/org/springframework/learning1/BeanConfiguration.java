package org.springframework.learning1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class BeanConfiguration {

	@Bean
	public User user() {
		return new User();
	}
}
