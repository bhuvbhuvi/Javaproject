package com.Polymorphism;

public class Upcasting {
	public void name() {
		System.out.println("bhuvi");
	}
public void accNo() {
	System.out.println("7835629410");
}
public void bankBalance() {
	System.out.println("15.123");
}
public void branchName() {
	System.out.println("NewZealand");
}
public static void main(String[] args) {
	Upcasting o = new Upcasting1();
	o.name();
	o.accNo();
	o.bankBalance();
	o.branchName();
}
	
}

