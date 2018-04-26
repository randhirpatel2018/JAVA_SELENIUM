package com.randhir.Class_Obj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonExp2 {
	
	private String name;
	private int age;

	public void accept() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Name :");
		name=br.readLine();
		System.out.println("Enter age :");
		age=Integer.parseInt(br.readLine());
		
		
	}
	public void check() {
		
		if (age<=30) 
			System.out.println(name+"is " + "young");
		else if(age<=50)
			System.out.println(name+" is " + "Middle aged");
		else System.out.println(name+" is " + "Old");
		
		
	}
}
