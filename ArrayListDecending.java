package com.pravotosoft;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDecending {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("Dog");
		al.add("Cat");
		al.add("Cow");
		al.add("Horse");	
		al.add("Tiger");
		al.add("Lion");
		System.out.println("ArrayList Before Sort :");
		for(String str:al){
			System.out.println(str);
		}
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("ArrayList in Decsending oder:");
		for(String str:al){
			System.out.println(str);
		}
	}

}
