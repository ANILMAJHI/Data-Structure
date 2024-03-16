package com.anil.array;

public class MinArray {

	static void minArrNo(int[] arr) {

		int l = arr.length;
		if (arr == null && l == 0) {
			System.out.println("no array is provided...");
		}
		int min = arr[0];
		for (int i = 0; i < l; i++) {
			while (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println(min);
	}

	public static void main(String[] args) {

		minArrNo(new int[] { 3, 4, 0, 7, 1, 9, 4 });
	}

}
