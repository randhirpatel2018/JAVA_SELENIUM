package com.randhir.String_practice;

public class strDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="A Book on JAVA";
		String s2=new String("I like it");
		char arr[]= {'D','R','E','A','M','T','E','C','H'};
		String s3= new String(arr);
		
		
		System.out.println("Length of string :"+s1.length()+"---"+s2.length()+"---"+s3.length());
		System.out.println("S1 joined s2 :"+s1.concat(s2));

	}

}
