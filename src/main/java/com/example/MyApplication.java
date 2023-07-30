package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.orders.Employee;
import com.example.orders.EmployeeConfig;

@SpringBootApplication
public class MyApplication extends SpringBootServletInitializer{
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(
				EmployeeConfig.class);
		 SpringApplication.run(MyApplication.class, args);
		 Employee e=context.getBean("employeeBean",Employee.class);
		 e.test();
	}
	@Override  
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)   
	{  
	return application.sources(MyApplication.class);  
	}   

}
