package com.visa.prj.entity;
/**
 * Basic Time class storing HH and MM
 * Can be used to add two time variables, from a class or from another Time instance.
 * @author root
 *
 */
public class Time {
	public int Hours;
	public int Minutes;
	public Time() {
	}
	public Time(int hours, int minutes) {
		Hours = hours;
		Minutes = minutes;
	}
	
	public int getHours() {
		return Hours;
	}
	public void setHours(int hours) {
		Hours = hours;
	}
	public int getMinutes() {
		return Minutes;
	}
	public void setMinutes(int minutes) {
		Minutes = minutes;
	}
	public static Time addTime(Time t1, Time t2) {
		Time sumTime = new Time();
		int sumHours = (int)(t1.getMinutes() + t2.getMinutes())/60 + t1.getHours() + t2.getHours();
		int sumMinutes = (t1.getMinutes() + t2.getMinutes())%60;
		sumTime.setHours(sumHours);
		sumTime.setMinutes(sumMinutes);
		return sumTime;
	}
	public Time addTime(Time t) {		
		return Time.addTime(this, t);
	}
}
