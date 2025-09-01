package com.nit.array;

public class MinNumInArrayWithoutDuplicates {

	public static void main(String[] args) {
		int arr[] = {5,3,2,2};
//		int max = arr[0],min = arr[0];
//		for(int i = 0;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//			{
//				max = arr[i];
//			}
//			if(arr[i]<min)
//			{
//				min = arr[i];
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
		
		for(int i = 0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even indeces :"+i+" And Even Numbers :"+arr[i]);
			}
		}
		
	}
}












