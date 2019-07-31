package com.visa.prj.client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.visa.prj.entity.Product;

public class ListExample {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));
		
		
		Stream<Product> mobiles = products.stream().filter(p -> p.getCategory().equals("mobile"));
		// Technically the above line only creates the stream, the filtering action, in this case have not happened yet :)
		
		List<Product> mobileList = mobiles.collect(Collectors.toList());
		// ^ this collects the list of mobiles
		
		List<String> nameList = products.parallelStream().map(p -> p.getName()).collect(Collectors.toList());
		
		// reduce(initV, (v1,v2) - > func(v1,v2))
		System.out.println("Foreach");
		for (Product product : mobileList) {
			System.out.println(product);
		}
		/*
		System.out.println("Iterator");
		Iterator<Product> iter = products.iterator();
		while(iter.hasNext()) {
			Product p = iter.next();
			System.out.println(p);
		}
		
		System.out.println("Index based, worst");
		
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
		*/
	}
}
