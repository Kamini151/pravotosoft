package com.pravotosoft;

import java.util.ArrayList;

public class ArrayListToStringArray {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Mango");
		al.add("Banana");
		al.add("Pear");
		al.add("Apple");
		al.add("Orange");
		String array[]=new String[al.size()];
		for(int i=0;i<al.size();i++){
			array[i]=al.get(i);
		}
		for(String k:array){
			System.out.println(k);
		}
	}

}
