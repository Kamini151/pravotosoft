package com.pravotosoft;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=6,flag=0,m;
		m=n/2;
		if(n==0||n==1){
			System.out.println("Number is not Prime");
		}
		else{
			for(int i=2;i<=m;i++){
				if(n%i==0){
					System.out.println("Number is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("Number is prime");
			}
			
		}
	}

}
