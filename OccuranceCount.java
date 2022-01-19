package com.pravotosoft;

import java.util.HashMap;

public class OccuranceCount {

	static void characterCount(String input){
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		char[]charArray=input.toCharArray();
		for(char c:charArray){
			if(hm.containsKey(c)){
				hm.put(c,hm.get(c)+1);
			}
			else{
				hm.put(c,1);
			}
		}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		characterCount("Water is life");
		characterCount("I am Hungry");
		characterCount("This is book");
	}
}