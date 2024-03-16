package com.anil.timecomplexity;

public class TimeComplexityCount {

	public static void print(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.println("i:"+i+" j: "+j);
			}
			System.out.println("end inner loop");
		}
		System.out.println("end of outre loop");
	}
	public static void main(String[] args) {

		print(3);
				
	}

}
