package com.pravotosoft;

import java.util.HashMap;

public class RemoveKeyValueHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(11,"Value1");
		hm.put(22,"Value2");
		hm.put(33,"Value3");
		hm.put(44,"Value4");
		hm.put(55,"Value5");
		hm.put(66,"Value6");
		hm.put(77,"Value7");
		System.out.println("HashMap Element:"+hm);
		Object remove=hm.remove(22);
		System.out.println("Element removed is:"+remove);
		
		Object remove1=hm.remove(44);
		System.out.println("Element Removed is :"+remove1);
		System.out.println("After Removing:");
		System.out.println("-------------------");
		System.out.println("HashMap Elemntes :"+hm);
	}

}
