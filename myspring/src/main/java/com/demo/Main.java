package com.demo;

import com.demo.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lijinxiong on 2019/10/29
 *
 * @author lijinxiong
 * @Description //TODO .
 */
public class Main {

//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
//		annotationConfigApplicationContext.register(AppConfig.class);
//		annotationConfigApplicationContext.refresh();
//		AppConfig bean = annotationConfigApplicationContext.getBean(AppConfig.class);
//		System.out.println(bean);
//	}


	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
		Student bean = applicationContext.getBean(Student.class);
		System.out.println(bean.toString());

	}

}
