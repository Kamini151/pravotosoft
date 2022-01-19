package com.pravotosoft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapUsingKeySet {
	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<String,String>();
		hm.put("Key1","Value1");
		hm.put("Key2","Value2");
		System.out.println("Iterator Using keySet");
		Set<String>keySet=hm.keySet();
		Iterator<String>keySetIterator=keySet.iterator();
		while(keySetIterator.hasNext()){
			String key=keySetIterator.next();
			System.out.println("key:"+key+"Value :"+hm.get(key));
		}
	}

}
