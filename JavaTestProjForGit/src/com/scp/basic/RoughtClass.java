package com.scp.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class RoughtClass {
	public static void main(String[] args) {
		int count=0;
		
		System.out.println("Enter the Number= ");
		String st=new Scanner(System.in).nextLine();
		
		char[] ch=st.toCharArray();
		System.out.println(ch);
		
		for (int i=0;i<st.length();i++) {
			if(st.charAt(i)=='1'||st.charAt(i)=='0') {
				count++;
			}else {
				System.out.println("It is not binary no");
				break;
			}
		}
		if(count==st.length()) 
		System.out.println("Number is binary");
		
			System.out.println("Trial onces");
		
	}
}


