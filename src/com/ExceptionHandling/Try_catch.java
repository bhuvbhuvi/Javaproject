package com.ExceptionHandling;

public class Try_catch {
public static void main(String[] args) {
	System.out.println("hello");
	try {
		System.out.println(18/0);
	} catch (java.lang.Exception e) {
		e.printStackTrace();
		
	}
	System.out.println("hi");
}
}
