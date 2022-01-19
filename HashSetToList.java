package com.pravotosoft;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToList {
	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<String>();
		hs.add("Mango");
		hs.add("Banana");
		hs.add("Pear");
		hs.add("Apple");
		hs.add("Orange");
		System.out.println("HashSet contain"+hs);
		List<String>l=new ArrayList<String>(hs);
		System.out.println("ArrayList contains :");
		for(String str:l){
			System.out.println(str);
		}
	}

}
