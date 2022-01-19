package com.pravotosoft;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapUsingEntrySet {
	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<String,String>();
		hm.put("Key1","Value1");
		hm.put("Key2","Value2");
		System.out.println("Iterator using Entryset");
		Set<Map.Entry<String,String>>entrySet=hm.entrySet();
		for(Map.Entry entry:entrySet){
			System.out.println("Key:"+entry.getKey()+"value"+entry.getValue());
			
		}
		
	}

}
