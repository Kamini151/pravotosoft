package com.pravotosoft;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Mumbai");
		al.add("Pune");
		al.add("Nagpur");
		al.add("Aurangabad");
		al.add("Delhi");
		al.add("Ahamadnagar");
		System.out.println("Before Sorting: "+al);
		Collections.sort(al);
		System.out.println("After Sorting :"+al);
	}

}
