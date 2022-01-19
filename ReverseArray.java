package com.pravotosoft;

public class ReverseArray {
public static void main(String[] args) {
	int arr1[]=new int[]{3,8,5,7,4};
	
	System.out.print("Array:");
	for(int i=0;i<arr1.length;i++){
		System.out.print(arr1[i]+"");
		
	}
	System.out.println();
	System.out.print("Array after reverse");
	for(int i=arr1.length-1;i>=0;i--){
		System.out.print(arr1[i]+"");	}
}
}
