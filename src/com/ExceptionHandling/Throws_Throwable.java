package com.ExceptionHandling;

public class Throws_Throwable {
	public static void main(String[] args) throws Throwable{
		System.out.println("hello");
		Thread.sleep(2000);
		try {
			System.out.println(18/0);
		} catch (java.lang.Exception e) {
			e.printStackTrace();
			
		}finally {
		System.out.println("hi");
		}
	}
}
