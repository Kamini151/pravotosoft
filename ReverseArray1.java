package com.pravotosoft;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray1 {
	 public static void main (String[] args) 
	    {  
	         Integer[] inputArray = {3,7,9,6,4}; 
	        System.out.println("Array without reverse" + Arrays.toString(inputArray)); 
	        reverseArray(inputArray);
	    }
	   public static void reverseArray(Integer[] arr) { 
	       
	        List<Integer> list = Arrays.asList(arr); 
	        Collections.reverse(list); 
	        System.out.print("Reverse Array :");
	        for(Integer val : list)
	            System.out.print(" "+val);
	   }
	}

