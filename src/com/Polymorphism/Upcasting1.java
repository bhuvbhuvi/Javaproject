package com.Polymorphism;

public class Upcasting1 extends Upcasting{
@Override
public void name() {
	System.out.println("Bhuvana");
	super.name();
}
@Override
	public void accNo() {
		System.out.println("959746362685");
		super.accNo();
	}
@Override
	public void bankBalance() {
		System.out.println("456.325");
		super.bankBalance();
	}
@Override
	public void branchName() {
		System.out.println("Mysore");
		super.branchName();
	}
public static void main(String[] args) {
	Upcasting1 ob = new Upcasting1();
	         ob.name();
	         ob.accNo();
	         ob.bankBalance();
	         ob.branchName();

}
}
