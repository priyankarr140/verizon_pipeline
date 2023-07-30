package com.example.orders;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="BeanAnnotation")
public class EmployeeConfig {
	
	@Bean
	public Employee employeeBean()
	{
		return new Employee(0,"");
	}
	 
	
	/*@Configuration
@ComponentScan(basePackages = "BeanAnnotation")
public class EmployeeConfig {
    
    @Bean
    public Employee employeeBean()
    {
        return new Employee();
    }

}
	 * */

}
