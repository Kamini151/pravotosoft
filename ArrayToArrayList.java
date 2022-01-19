package com.pravotosoft;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
public static void main(String[] args) {
	String citynames[]={"Nagpur","Wardha","Amravti","Pune"};
	ArrayList<String>al=new ArrayList<String>(Arrays.asList(citynames));
	al.add("Chandrapur");
	al.add("Akola");
	for(String str:al){
		System.out.println(str);
	}
}
}
