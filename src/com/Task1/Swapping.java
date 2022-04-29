package com.Task1;

public class Swapping {
	public static void main(String[] args) {
	
	double a = 1.25;
    double  b = 2.25;
	double c = 3.25;
	double d ;
	
    d = a;//a = 1.25  d = 1.25  a = null;
    a = c;//c = 3.25  a = 3.25 c = null;
    c = b; //b = 2.25 c = 2.25  b = null;
    b = d; // d = 1.25  b = 1.25 d = null;
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

	}
} 
	