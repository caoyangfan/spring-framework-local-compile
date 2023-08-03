package org.springframework.learning1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = context.getBean("user", User.class);
		System.out.println("execute finished ：User username: "+user.getUsername()+",age: "+user.getAge());
	}
}
