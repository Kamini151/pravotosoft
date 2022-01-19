package com.pravotosoft;

public class AmstrongNumber {
public static void main(String[] args) {
	int n=153,number,temp,total=0;
	number=n;
	while(number!=0){
		temp=number%10;
		total=total+temp*temp*temp;
		number/=10;
	}
	if(total==n){
		System.out.println("Number is Amstrong");
	}else{
		System.out.println("Number is not Amstrong");
	}
}
}
