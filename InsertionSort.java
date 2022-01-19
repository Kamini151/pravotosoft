package com.pravotosoft;

import java.util.Arrays;

public class InsertionSort {
	void insertionSort(int array[]){
		int size=array.length;
		for(int step=1;step<size;step++){
			int key=array[step];
			int j=step-1;
			while(j>=0 && key <array[j]){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
	}
	public static void main(String[] args) {
		int[]data={8,4,5,7,0,9,3,};
		InsertionSort is=new InsertionSort();
		is.insertionSort(data);
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(data));
	}

}
