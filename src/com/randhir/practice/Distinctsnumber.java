package com.randhir.practice;

public class Distinctsnumber {
	
	public void FindDistinctNumber(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			boolean isDistinct=false;
			for (int j = 0; j < i; j++) {
				if (arr[i]==arr[j]) {
					isDistinct=true;
					break;
				}
				
			}
			if(!isDistinct) {
				System.out.println(arr[i]+" ");
				
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		int a[]= {1,1,2,23,4,5,5,6,6};
		Distinctsnumber d=new Distinctsnumber();
		d.FindDistinctNumber(a);
	}

}
