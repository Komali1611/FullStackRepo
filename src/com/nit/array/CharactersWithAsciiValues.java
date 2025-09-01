package com.nit.array;

public class CharactersWithAsciiValues {

	public static void main(String[] args) {
		
		char arr[] = {'N','O','2','6',' ' ,'S','n','d'};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+" "+arr[i]+"-> "+(int) arr[i]);
		}
	}
}
