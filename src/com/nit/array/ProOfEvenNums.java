package com.nit.array;

public class ProOfEvenNums {

	public static void main(String[] args) {
		int arr[] = {2,4,5,8,9,7,12,15,22};
		
//		int pro = 1;
//		for(int i =0;i<arr.length;i++)
//		{
//			//if(arr[i]>9 && arr[i]<100)
//			if(arr[i]>0)
//			{
//				pro *= arr[i];
//				
//			}
//		}
//		
//		System.out.println(pro);
		
		
		int count =0;
		for(int i =0;i<arr.length;i++) 
		{
			if(arr[i]%2==0)
			{
				count++;	
			}
			
		}
		System.out.println("Even numbers are :"+count);
		
		}
				
}
	














