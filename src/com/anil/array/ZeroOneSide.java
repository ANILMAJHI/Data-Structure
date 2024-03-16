package com.anil.array;

import java.util.LinkedList;

public class ZeroOneSide {

	static void zeroOneSide(int[] arr)
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			
			
			if(arr[i]==0)
			{
				l.addFirst(arr[i]);
			}else {
				l.addLast(arr[i]);
			}
		}
		System.out.println(l);
	}
	public static void main(String[] args) {

		zeroOneSide(new int[] {0,1,0,3,0,4,0,6} );
	}

}
