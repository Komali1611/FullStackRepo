package com.nit.array;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size :");
		int n = sc.nextInt();
        int arr[] = new int[n];
        
		System.out.println("Enter "+n+"elements:");
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		
		for(int i =0;i<n;i++)
		{
			int count = 0;
			for(int j =1;i<n;j++) {
			if(arr[i]%j == 0)
			{
				count ++;
			}
		} 
			if(count == 2)
			{
				System.out.println(arr[i]+"prime num:");
			}
			else
			{
				System.out.println(arr[i]+"composite number");
			}
		}
		

		
	}
}

