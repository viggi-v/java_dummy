package com.visa.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.visa.prj.entity.Product;
import com.visa.prj.service.OrderService;

public class ProductClient {

	public static void main(String[] args) {
		// This is to create SpringContainer (Annotation based)
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		
		// if xml based Spring Container was to be created, kill yourself 
		// or use
		// ApplicationContext ctx = new ClassPathXmlApplicationContext();
		
		ctx.scan("com.visa.prj");
		ctx.refresh();
		
		OrderService os = ctx.getBean("orderService", OrderService.class);
		
		Product p = new Product(0,"iPod", "music", 49.99, 1000);
		os.insertProduct(p);
		
		System.out.println("Inserted: " + p.getId());
		System.out.println(p);

	}

}
