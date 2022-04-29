package com.Polymorphism;

public class Overloading {
  public void employeeDetails(String name , char ini) {
	  System.out.println("studentname is "+name+" ."+ini);
  }
  public void employeeDetails(String Dob, int age) {
	System.out.println("Dob and age is  "+Dob+","+age);
  }
  public void employeeDetails(String place) {
		System.out.println("location is "+place);
	  }
  public void employeeDetails(int Pin) {
	  System.out.println("Pincode is "+Pin);
		 }
  public void employeeDetails(String ifsc , String branchname) {
		System.out.println("Information is "+ifsc+","+branchname);
	  }
  public static void main(String[] args) {
	Overloading o = new Overloading();
	
	o.employeeDetails("veni", 's');
	o.employeeDetails("20/06/1996", 25);
	o.employeeDetails("chennai");
	o.employeeDetails(605009);
	o.employeeDetails("IDBI000F1253", "state bank of india");
	
}
}
