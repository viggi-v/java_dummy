package com.visa.prj.dao;

import java.util.ResourceBundle;


public class MobileDaoFactory {
	private static String NAME = "";
	static{
		ResourceBundle res = ResourceBundle.getBundle("database");
		NAME = res.getString("MOBILE_CLIENT");
	}
	public static MobileDao getMobileDao() {
		try {
			return (MobileDao) Class.forName(NAME).newInstance();
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
