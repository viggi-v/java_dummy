package com.visa.prj.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {

	@Test
	public void testAddTimeTimeTime() {
		Time t1 = new Time(2,50);
		Time t2 = new Time(3,15);
		Time ex1 = new Time(6,5);
		Time result = Time.addTime(t1, t2);
		if(!result.equals(ex1)) {
			fail("Wrong time returned");
		}
		else {
			return;
		}
	}

	@Test
	public void testAddTimeTime() {
		fail("Not yet implemented");
	}

}
