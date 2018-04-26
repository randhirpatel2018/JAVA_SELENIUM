package com.randhir.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {
	
	public void reverseNumber() throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number you wnt to reverse :");
		int number=Integer.parseInt(br.readLine());
		
		int reverse=0;
		while (number!=0) {
			reverse=reverse*10;
			reverse=reverse+number%10;
			number=number/10;
			
		}
		System.out.println("Reverse Number is :- "+reverse);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ReverseNumber r=new ReverseNumber();
		r.reverseNumber();
		

	}

}
