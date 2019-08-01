package com.visa.prj.client;

import com.visa.prj.entity.Time;

public class TimeClient {
	public static void main(String[] args) {
		Time t1 = new Time(2,50);
		
		Time t2 = new Time(3,15);
		
		Time t3 = t1.addTime(t2);
		
		Time t4 = Time.addTime(t1, t2);
		
		System.out.println("T3 is "+t3.getHours()+"HH : "+t3.getMinutes()+"MM");
		System.out.println("T4 is "+t4.getHours()+"HH : "+t4.getMinutes()+"MM");
	};
}
