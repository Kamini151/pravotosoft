package com.pravotosoft;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingIterator {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(13);
		al.add(78);
		al.add(45);
		al.add(23);
		al.add(97);
		
		System.out.println("Using for Loop:");
		for(int counter=0;counter<al.size();counter++){
			System.out.println(al.get(counter));
		}
		System.out.println("Using Advanced for Loop");
		for(Integer num:al){
			System.out.println(num);
		}
		System.out.println("Using While loop");
		int count=0;
		while(al.size()>count){
			System.out.println(al.get(count));
			count++;
		}
		System.out.println("Using Iterator");
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("Using Collection Stream()util");
		al.forEach((num)->{
			System.out.println(num);
		});
	}

}
