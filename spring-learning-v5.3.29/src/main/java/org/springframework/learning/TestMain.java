package org.springframework.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		User user = context.getBean("user", User.class);
		System.out.println(user);
	}
}
