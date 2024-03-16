package com.anil.array;

import java.util.Arrays;

public class ReverseArray {

	static void reverseArray(int[] arr) {
		int l = arr.length;
		for (int i = 0; i < l/2; i++) {

			int temp=arr[i];
			arr[i]=arr[l-1-i];
			arr[l-1-i]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		reverseArray(new int[] { 2, 11, 5, 10, 7, 8 });
	}

}
