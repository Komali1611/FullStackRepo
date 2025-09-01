package com.nit.array;

public class PrintUppercaseCharacters {
	public static void main(String[] args) {
		
		char arr[] = {'N','O','2','6',' ' ,'S','n','d'};
		for(int i=0;i<arr.length;i++)
		{
			//if(Character.isUpperCase(arr[i]))
			//if(Character.isLowerCase(arr[i]))
			//(Character.isDigit(arr[i]))
			if(!Character.isSpace(arr[i]))
			System.out.println(arr[i]);
		}
	}
}
