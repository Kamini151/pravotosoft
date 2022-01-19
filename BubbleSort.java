package com.pravotosoft;

import java.util.Arrays;

public class BubbleSort {
	static void  bubblesort(int array[]){
		int size=array.length;
		for(int i=0;i<size-1;i++)
			for(int j=0;j<size-i-1;j++)
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
	}
	public static void main(String[] args) {
		int[]data={2,6,4,46,75,43,22,11,34};
		BubbleSort.bubblesort(data);
		System.out.println("Sorted Attay:");
		System.out.println(Arrays.toString(data));
		
		
	}

}
