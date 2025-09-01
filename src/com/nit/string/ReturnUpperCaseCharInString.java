package com.nit.string;

public class ReturnUpperCaseCharInString {
	
      public static void main(String[] args) {
	   
    	  char arr[] = {'N','O','S','2','3','s','o','u','n','D'};
    	  String s ="KOMALI ";
    	  for(int i =0; i<arr.length;i++)
    	  {
    		  if(Character.isUpperCase(arr[i]))// isLowerCase, isDigit
    		  {
    			  s+=arr[i];
    		  }
    	  }
    	  System.out.println("upper case characters:"+s);
    }
}
