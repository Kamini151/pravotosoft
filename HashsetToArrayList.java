package com.pravotosoft;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetToArrayList {
public static void main(String[] args) {
	HashSet<String>hs=new HashSet<String>();
	hs.add("Mango");
	hs.add("Banana");
	hs.add("Pear");
	hs.add("Apple");
	hs.add("Orange");
	System.out.println("Hashset Contains:"+hs);
	ArrayList<String>al=new ArrayList<String>(hs);
	System.out.println("ArrayList Contains:"+al);
	
}
}
