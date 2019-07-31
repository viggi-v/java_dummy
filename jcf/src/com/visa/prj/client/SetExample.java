package com.visa.prj.client;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

import com.visa.prj.entity.Product;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> products = new HashSet<>();
		products.add(new Product(645,"Hp Laptop",135000.00,"computer",100));
		products.add(new Product(224,"iPhone",98000.00,"mobile",500));
		products.add(new Product(834,"Logitech Mouse",600.00,"computer",300));
		products.add(new Product(5,"Sony Bravia",125000.00,"tv",900));
		products.add(new Product(912,"One Plus",32000.00,"mobile",100));
		products.add(new Product(88,"HP Printer",19000.00,"computer",100));
		products.forEach(System.out::println);
		// Sets do not support index based traversal, but it supports forEach and iterator
	
		Map<String, List<Product>> catMap = products.stream().collect(Collectors.groupingBy(p->p.getCategory()));
		
		//Note that the following code is pretty slow so use it only if you wanna traverse the map
		// conditionally. if you want to traverse the entire map use the second method
		Set<String> keys = catMap.keySet();
		for(String key : keys) {
			System.out.println(key+":");
			List<Product> catProducts = catMap.get(key);
			catProducts.forEach(System.out::println);
		}
		// Method two, recommended if you plan to traverse the entire map
		catMap.forEach((key, value) -> {
			System.out.println(key);
			value.forEach(System.out::println);
		});
	}

}
