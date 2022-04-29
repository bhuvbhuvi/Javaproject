package com.Constructor;

public class Cntr {
	public Cntr(String name , char ini) {
		System.out.println("name and char:"  +name+ ","+ini);
	}
	public Cntr(String Dob , int age) {
		System.out.println("dateOfBirth and age:" +Dob+ ","+age);
	}
	public Cntr(String loc) {
		System.out.println("place:" +loc);
	}
	public Cntr(int pincode) {
		System.out.println("pin:" +pincode);
	}
	public Cntr(String ifsc, double deposit) {
		System.out.println("ifsc and cash:" +ifsc+","+ deposit);
	}
    public Cntr() {
    	System.out.println("default constructor");
    }
    public static void main(String[] args) {
		Cntr o1 = new Cntr();
	    Cntr o = new Cntr("veni" , 'p');
	    Cntr p = new Cntr("20/05/2000", 21);
	    Cntr q = new Cntr("Mysore");
	    Cntr r = new Cntr("605271");
	    Cntr s = new Cntr("SBI7052V25" , 5000.55);
	    
	    		
	    
	}
}
