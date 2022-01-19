package com.pravotosoft;

import java.util.Arrays;

public class Anagram {
	public static boolean isAnagram(String first,String second){
		first=first.replace("\\s","".toLowerCase());
		second=second.replace("\\s","").toLowerCase();
		if(first.length()!=second.length())
			return false;
		char[] firstArray=first.toCharArray();
		char[] secondArray=second.toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		return Arrays.equals(firstArray,secondArray);
	}
public static void main(String[] args) {
	boolean result=isAnagram("now","own");
	System.out.println(result);
}
}
