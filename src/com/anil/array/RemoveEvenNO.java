package com.anil.array;

public class RemoveEvenNO {

	static void removeEvenNo(int[] arr)
	{
		int l=arr.length;
		for (int i = 0; i < l; i++) {
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]+" ");
			}
		}
	}
	
	public static void main(String[] args) {

		removeEvenNo(new int[] {3,2,4,7,10,6,5});
	}

}
