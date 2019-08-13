package com.visa.prj.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.visa.prj.annotations.Column;
import com.visa.prj.annotations.Table;

public class SQLUtil {
	public static String generateCreateSQL(Class<?> clazz) {
		StringBuilder builder = new StringBuilder();
		
		// Note that String is by default immutable and stays on the heap or pool
		// so String s += another String keeps creating new objects, and is 
		// the messy. 
		// use stringBuilder or stringBuffer, which are mutable
		// #keepYourPoolsClean
		// StringBuffer is threadSafe, Syncd Methods
		// StringBuilder is NOT Threadsafe, but cheaper computationally. so if you want
		// something on a method level, use this, it will stay on the stack.
		
		Table t = clazz.getAnnotation(Table.class);
		
		if(t != null) {
			
			builder.append("create table");
			builder.append(" ");
			builder.append(t.name());
			builder.append("(");
			
			Method[] methods = clazz.getDeclaredMethods();
			
			for (Method method : methods) {
				if(method.getName().startsWith("get")) {
					Column c = method.getAnnotation(Column.class);
					if(c != null) {
						builder.append(c.name());
						builder.append(" ");
						builder.append(c.type());
						builder.append(", ");
					}
				}
			}	
		}
		
		builder.setCharAt(builder.lastIndexOf(","), (')'));
		return builder.toString();
	}
	
	public static String generateInsertSQL(Object obj) {
		StringBuilder builder = new StringBuilder();
		
		Table t = obj.getClass().getAnnotation(Table.class);
		if(t!= null) {
			builder.append("Insert into");
			builder.append(" ");
			builder.append(t.name());
			
			builder.append("(");
			
			Method[] methods = obj.getClass().getDeclaredMethods();
			
			StringBuilder typeBuilder = new StringBuilder();
			StringBuilder valueBuilder = new StringBuilder();
			
			for (Method method : methods) {
				if(method.getName().startsWith("get")) {
					Column c = method.getAnnotation(Column.class);
					if(c != null) {
						typeBuilder.append(c.name());
						typeBuilder.append(", ");
						try {
							valueBuilder.append(method.invoke(obj));
							valueBuilder.append(", ");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			
			builder.append(typeBuilder.toString());
			builder.setCharAt(builder.lastIndexOf(","),')');
			builder.append("values (");
			builder.append(valueBuilder.toString());
			builder.setCharAt(builder.lastIndexOf(","),')');		
		}
		return builder.toString();
	}
}
