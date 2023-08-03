package org.springframework.learning1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo2 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		User user = context.getBean("user", User.class);
		System.out.println("execute finished ：User username: "+user.getUsername()+",age: "+user.getAge());
	}
}
