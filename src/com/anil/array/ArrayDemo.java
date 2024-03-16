package com.anil.array;

public class ArrayDemo {

	public void printUtil(int[] arr)
	{
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {

		ArrayDemo demo=new ArrayDemo();
		demo.printUtil(new int[] {5,1,2,9,10});
	}

}
