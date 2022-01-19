package com.pravotosoft;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayToTreeSet {
	public static void main(String[] args) {
		Integer[]num={7,34,45,23,38,56,21};
		List<Integer>list=Arrays.asList(num);
		Set<Integer>set=new TreeSet<Integer>(list);
		System.out.println("The Set Elements are:");
		for(Integer var:set)
			System.out.println(var);
	}

}
