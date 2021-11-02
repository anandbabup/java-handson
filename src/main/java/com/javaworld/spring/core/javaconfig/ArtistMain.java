package com.javaworld.spring.core.javaconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArtistMain {
	public static void main(String[] args) {
		
		//approach 1- using ApplicationContext
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
		System.out.println(applicationContext.getBean("MyArtist"));
		
		//approach 2- using ApplicationContext
		BeanFactory beanFactory = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
		System.out.println(beanFactory.getBean("MyArtist"));
	}
}
