package com.ExceptionHandling;

public class Finally {
	public static void main(String[] args) {
		System.out.println("hello");
		try {
			System.out.println(18/0);
		} catch (java.lang.Exception e) {
			e.printStackTrace();
			
		}finally {
			
		System.out.println("hi");
		}
	}
}
