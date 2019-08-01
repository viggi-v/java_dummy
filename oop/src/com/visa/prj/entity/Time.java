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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Hours;
		result = prime * result + Minutes;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (Hours != other.Hours)
			return false;
		if (Minutes != other.Minutes)
			return false;
		return true;
	}
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
