package com.Exception;

public class StringIndexOutofBound {
	
	public static void main(String[] args) {
		String o = "goodmorning";
		
		char charAt = o.charAt(80);
		System.out.println(charAt);
	}

}
