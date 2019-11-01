package com.demo.circular;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by lijinxiong on 2019/10/31
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class Main {


	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(Config.class);
		annotationConfigApplicationContext.refresh();

		annotationConfigApplicationContext.getBean(Person.class);
		System.out.println();
	}
}
