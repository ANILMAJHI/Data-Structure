package com.anil.timecomplexity;

public class TimeComplexity {

	public void findSum(int n){
		
		/*
		 * int sum = 0; for (int i = 0; i <= n; i++) { sum = sum + i; }
		 * System.out.println(sum);
		 */
		
		
		int sum = n * (n + 1) / 2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		double now = System.currentTimeMillis();

		TimeComplexity t = new TimeComplexity();
		t.findSum(999999);
		System.out.println("Time- taken: " + (System.currentTimeMillis() - now) + " miliseconds");
	}

}
