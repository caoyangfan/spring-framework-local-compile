package org.springframework.learning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

	@Bean
	public User user() {
		User user = new User();
		user.setUsername("Alex v6.1.0-M1 用户名中文乱码测试");
		user.setAge(22);
		user.setSex("男");
		user.setWeight(68);
		user.setHeight(182);
		return user;
	}

	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("Person v6.1.0-M1 用户名中文乱码测试");
		person.setAge(22);
		person.setSex("男");
		person.setMobile("15245654854");
		return person;
	}

}