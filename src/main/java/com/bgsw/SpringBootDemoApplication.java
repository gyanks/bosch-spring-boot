package com.bgsw;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(SpringBootDemoApplication.class, args);

		System.out.println(" Number of Beans "+ ctx.getBeanDefinitionCount());

	String []names=	ctx.getBeanDefinitionNames();

	for (String name: names){
		System.out.println(" "+ name);
	}




	}


}
