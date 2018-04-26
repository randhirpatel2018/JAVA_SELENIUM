package com.randhir.String_practice;

public class Strsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello, this is a java book";
		String s[];
		s=str.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}

	}

}
