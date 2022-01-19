package com.pravotosoft;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Apple");
		al.add("Amazon");
		al.add("Facebook");
		al.add("Google");
		al.add("IBM");
		al.add("Tesla");
		System.out.println("Before Reversing");
		System.out.println(al.toString());
		Collections.reverse(al);
		System.out.println("After Reversing");
		System.out.println(al);
	}

}
