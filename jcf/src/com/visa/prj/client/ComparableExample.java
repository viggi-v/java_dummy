package com.visa.prj.client;
import java.util.Arrays;


public class ComparableExample {
	public static void main(String[] args) {
		
		String[] names = {"Lee","Kevin","Angelina","George","Brad"};
		
		Arrays.sort(names); // regular sort
		
 		Arrays.sort(names, (s1,s2) -> s1.length() - s2.length());
		
	}
}
