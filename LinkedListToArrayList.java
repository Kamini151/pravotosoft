package com.pravotosoft;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
	public static void main(String[] args) {
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("Mango");
		ll.add("Banana");
		ll.add("Grapgs");
		ll.add("Pear");
		ll.add("Apple");
		ArrayList<String>al=new ArrayList<String>(ll);
		for(String str:al){
			System.out.println(str);
		}
	}

}
