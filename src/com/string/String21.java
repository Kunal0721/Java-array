package com.string;

public class String21 {
	
	//1. Reverse a String
	public static String reverseString(String str) {
		int len = str.length();
		String rev ="";
		for(int i=len-1; i>=0; i--) {
			rev+=str.charAt(i);
		}
		
		return rev;
	}
}
