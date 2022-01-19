package com.pravotosoft;

import java.util.HashMap;

public class HashMapUsingForEach {
	public static void main(String[] args) {
		
		HashMap<String,String>hm=new HashMap<String,String>();
		hm.put("Key1","Value1");
		hm.put("Key2","Value2");
		System.out.println("Iterating using foreach loop");
		for(String key:hm.keySet()){
			System.out.println("Key :"+key+"Value:"+hm.get(key));
		}
	}

}
