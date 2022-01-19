package com.pravotosoft;

public class SwapUsingThird {
	public static void main(String[] args) {
		int a=5,b=8;
		int temp=0;
		System.out.println("Before Swapping :"+a +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping :"+a +b);
	}
}
