package com.randhir.Class_Obj;

public class Person {
	
	private String name;
	private int age;
	Person(){
		name="Randhir";
		age=28;
	}
	Person(String s,int i){
		name=s;
		age=i;
	}
	void talk() {
		System.out.println("Hello My name is :"+name);
		System.out.println("I am :"+age);
	}

	public static void main(String[] args) {
		
		Person p=new Person();
		p.talk();
		Person p1=new Person("Bapi",25);
		p1.talk();

	}

}
