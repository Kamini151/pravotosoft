package com.pravotosoft;

import java.util.Arrays;

public class MAximunInArray {
	public static int max(int[]a,int total){
		Arrays.sort(a);
		return a[total-1];
	}
public static void main(String[] args) {
	int a[]={1,7,91,12,57};
	System.out.println("Largest: "+max(a,5));
}

}
