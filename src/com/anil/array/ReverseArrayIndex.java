package com.anil.array;

import java.util.Arrays;

public class ReverseArrayIndex {

	static void reverseArray(int[] arr, int start, int end) {
		int l = arr.length;
		for (int i = 0; i < l; i++) {
			//System.out.print(arr[i] + " ");
			//System.out.println();
			while (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;

			}

		}
		System.out.print(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int[] arr = { 2, 11, 5, 10, 7, 8 };
		reverseArray(arr, 0, arr.length - 1);
	}

}
