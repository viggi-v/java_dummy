package com.visa.prj.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testGetSum() {
		int[] data = {5,6,7};
		assertEquals(18, ArrayUtil.getSum(data));
		
		int[] elems = {-1, 0, 1};
		assertEquals(0, ArrayUtil.getSum(elems));
	}

	@Test
	public void testGetCount() {
		int[] data = {1,3,5,6,3,2,7,3,3,6};
		assertEquals(4, ArrayUtil.getCount(data, 3));
	}

	@Test
	public void testSort() {
		int[] data = {13,3,56,67,31,2,7,3,3,6};
		ArrayUtil.sort(data);
		int[] expected = {2,3,3,3,6,7,13,31,56,67};
		assertArrayEquals(expected, data);
	}

}
