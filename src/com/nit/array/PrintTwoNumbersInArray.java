package com.nit.array;

public class PrintTwoNumbersInArray {

	public static void main(String[] args) {
		int arr[] = {23,5,4,77,45,8,9,100,101,234};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>9 && arr[i]<100)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
