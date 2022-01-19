package com.pravotosoft;

import java.util.Arrays;

public class Secondhighest {
public static int max(int[]a,int total){
	Arrays.sort(a);
	return a[total-2];
}
public static void main(String[] args) {
	int a[]={1,56,78,97,59};
	System.out.println("Second Largest : "+max(a,5));
	
}
}
