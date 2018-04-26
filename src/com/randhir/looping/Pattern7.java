package com.randhir.looping;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of Line You want to print :");
		int number=Integer.parseInt(br.readLine());
		for (int i = number; i >=1 ; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();

		}
		for (int i = 2; i <= number; i++) {
			//System.out.println(i);
			for (int j =1 ; j <=i; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
			
		}
	}

}
