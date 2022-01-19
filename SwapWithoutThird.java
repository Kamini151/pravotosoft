package com.pravotosoft;

public class SwapWithoutThird {
	public static void main(String[] args) {
		int a=7,b=5;
		System.out.println("Before Swapping : "+a+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping :"+a+b);
	}

}
