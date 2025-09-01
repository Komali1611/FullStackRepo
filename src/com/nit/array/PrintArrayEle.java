package com.nit.array;

public class PrintArrayEle {

	public static void main(String[] args) {
		
		int arr[] = {3,6,2,7,5};
		for(int i =0;i<arr.length;i++)
		{
			//System.out.println(i+":"+arr[i]);
			
			if(arr[i]%2==0)
			{
				System.out.println("even number:"+arr[i]);
			}
			else
			{
				System.out.println("odd nums"+arr[i]);
			}
		}
		
		
		
	}
}
