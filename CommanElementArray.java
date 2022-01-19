package com.pravotosoft;

public class CommanElementArray {
public static void main(String[] args) {
	int arr1[]={1,5,7,4,9,3};
	int arr2[]={1,3,2,4,6,8};
	for(int i=0;i<arr1.length;i++){
		for(int j=0;j<arr2.length;j++){
			if(arr1[i]==arr2[j]){
				System.out.println("Comman Element in array :"+(arr1[i]));
			}
			
		}
	}
}
}
