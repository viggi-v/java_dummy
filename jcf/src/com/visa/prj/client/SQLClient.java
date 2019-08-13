package com.visa.prj.client;

import com.visa.prj.entity.Product;
import com.visa.prj.util.SQLUtil;

public class SQLClient {

	public static void main(String[] args) {
		
		String CREATE_SQL = SQLUtil.generateCreateSQL(Product.class);
		System.out.println(CREATE_SQL);
		Product product = new Product(101,"iPhone XR",99999,"Electronics",10);
		String INSERT_SQL = SQLUtil.generateInsertSQL(product);
		System.out.println(INSERT_SQL);
		

	}

}
