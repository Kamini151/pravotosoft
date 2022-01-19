package com.pravotosoft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap {
public static void main(String[] args) {
	HashMap<Integer,String>hm=new HashMap<Integer,String>();
	hm.put(33,"Z");
	hm.put(99,"I");
	hm.put(22,"A");
	hm.put(55,"B");
	hm.put(88,"X");
	hm.put(44,"M");
	System.out.println("Before Sorting:");
	Set s=hm.entrySet();
	Iterator iterator=s.iterator();
	while(iterator.hasNext()){
		Map.Entry pair=(Map.Entry)iterator.next();
		System.out.print(pair.getKey()+":");
		System.out.println(pair.getValue());
	}
	Map<Integer,String>tm=new TreeMap<Integer,String>(hm);
	System.out.println("\nAfter Sorting:");
	Set s1=hm.entrySet();
	Iterator iterator2=s1.iterator();
	while(iterator2.hasNext()){
		Map.Entry pair=(Map.Entry)iterator2.next();
		System.out.print(pair.getKey()+":");
		System.out.println(pair.getValue());
	}
}
}
