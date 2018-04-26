package com.randhir.String_practice;

public class Str_reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Data";
		String s2="Base";
		System.out.println(s1.hashCode()+"---------"+s2.hashCode());
		s1=s1+s2;
		System.out.println(s1);
		System.out.println(s1.hashCode());

	}

}
