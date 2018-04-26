package com.randhir.String_practice;

public class Strcpy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello, this is a java book";
		char arr[]=new char[20];
		str.getChars(7, 21, arr, 0);
		System.out.println(arr);

	}

}
