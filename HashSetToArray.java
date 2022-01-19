package com.pravotosoft;

import java.util.HashSet;

public class HashSetToArray {
	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<String>();
		hs.add("Pear");
		hs.add("Mango");
		hs.add("Graphs");
		hs.add("Orange");
		hs.add("Apple");
		System.out.println("Hashset Contains:"+hs);
		String[]array=new String[hs.size()];
		hs.toArray(array);
		System.out.println("Array contains :");
		for(String str:array){
			System.out.println(str);
		}

	}

}
