package com.scp.basic;

import java.util.Scanner;

public class CheckPrimeNo {
	public static void main(String[] args) {
		int count=0;
		System.out.print("Enter the Number= ");
		int n=new Scanner(System.in).nextInt();
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("It is not a prime number");
		}else {
			System.out.println("It is a prime number");
		}
	}
}
