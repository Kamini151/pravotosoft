package com.pravotosoft;

public class FibbonacciSeries {
	public static void main(String[] args) {
		int n=100,firstTerm=0,secondTerm=1,count=0;
		while(firstTerm<n){
			System.out.print(firstTerm+" ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			count=count+1;
		}
		
	}

}
