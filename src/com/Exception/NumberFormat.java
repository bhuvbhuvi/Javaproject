package com.Exception;

public class NumberFormat {

	public static void main(String[] args) {
		
		String s = "&&*%$";
		
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
		
		String valueof = s.valueOf(parseInt);
		System.out.println(valueof);
		
		Integer valueof2 = Integer.valueOf(s);
		System.out.println(valueof2);
	}
	
}
