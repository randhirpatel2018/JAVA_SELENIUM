package com.randhir.looping;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "string";
        int len = s.length();           
        String tmp = "";
        for (char c : s.toCharArray()) {
            tmp += tmp.length() > 0 ? " " + String.valueOf(c) : String.valueOf(c);
            System.out.printf("%" + (len + tmp.length() - 1) + "s\n", tmp);
            len--;
        }

	}

}
