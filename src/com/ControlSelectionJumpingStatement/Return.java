package com.ControlSelectionJumpingStatement;

public class Return {
 static public int age(int age1 , int age2) {
	return age1+age2;
 }
 static public String name (String name1, String name2) {
	 return name1+name2;
	 }
 static public double value(double value1,double value2) {
return value1+value2;
}
public static void main(String[] args) {
	String name = name("sasi" , "sudha");
	int age = age(20,15);
	double value = value(0.25,5.25);
	
	System.out.println(name);
	System.out.println(age);
	System.out.println(value);

	
}
}
