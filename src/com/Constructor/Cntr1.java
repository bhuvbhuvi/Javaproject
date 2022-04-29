package com.Constructor;

public class Cntr1 {
	public void details(double balance) {
		System.out.println("cash:" +balance);
	}
	public void loan(String bike) {
		System.out.println("loan:"  +bike);
		}
public static void main(String[] args) {
	Cntr o1 = new Cntr();
    Cntr o = new Cntr("veni" , 'p');
    Cntr p = new Cntr("20/05/2000", 21);
    Cntr q = new Cntr("Mysore");
    Cntr r = new Cntr("605271");
    Cntr s = new Cntr("SBI7052V25" , 5000.55);
   Cntr1 cntr1 = new Cntr1();
cntr1.details(5000.20);
cntr1.loan("90,000");

}
   
    
    
	

}
