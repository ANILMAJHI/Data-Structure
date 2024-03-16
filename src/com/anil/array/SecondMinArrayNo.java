package com.anil.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondMinArrayNo {
	static void secMinArrNo(int[] arr) {
		int l = arr.length;
		if (arr == null && l == 0) {
			System.out.println("no array is provided...");
		}
		Set s = new HashSet();
		for (int num : arr) {

			s.add(num);
		}
		
	}

	public static void main(String[] args) {

		secMinArrNo(new int[] { 3, 4, 0, 7, 0, 1, 9, 4 });
	}

}
