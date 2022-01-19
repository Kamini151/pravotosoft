package com.pravotosoft;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEntrySet {
	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<String,String>();
		hm.put("Key1","Value1");
		hm.put("Key2","Value2");
		System.out.println("Iterator Using EntrySet");
		Set<Map.Entry<String,String>>entrySet1=hm.entrySet();
		Iterator<Map.Entry<String,String>>entrySetIterator=entrySet1.iterator();
		while(entrySetIterator.hasNext()){
			Map.Entry entry=entrySetIterator.next();
			System.out.println("Key:"+entry.getKey()+"value:"+entry.getValue());
		}
		
	}

}
