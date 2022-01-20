package com.pravotosoft;

public class Anagram1 {
	public static boolean isAnagram(String first,String second){
		first=first.replace("\\s","").toLowerCase();
		second=second.replace("\\s","").toLowerCase();
		if(first.length()!=second.length())
			return false;
		char[]firstArray=first.toCharArray();
		for(char c:firstArray){
			int index=second.indexOf(c);
			if(index==-1)
				return false;
			second=second.substring(0,index)+second.substring(index+1,second.length());
		}
		return true;
	}
	public static void main(String[] args) {
		boolean result=isAnagram("now","own");
		System.out.println(result);
	}

}



