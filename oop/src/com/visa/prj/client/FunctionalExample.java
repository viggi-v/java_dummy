package com.visa.prj.client;

@FunctionalInterface 
interface Computation{
	int compute(int x, int y);
}

public class FunctionalExample {

	public static void main(String[] args) {
		Computation addition = new Computation() {
			
			@Override
			public int compute(int x, int y) {
				return x + y;
			}
		};
		Computation subtraction = new Computation() {
			
			@Override
			public int compute(int x, int y) {
				return x - y;
			}
		};
	}

}
