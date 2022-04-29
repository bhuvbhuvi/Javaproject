package com.Polymorphism;

public class Overriding1 extends Overriding {
	@Override
	public void name(String name) {
		super.name(name);
	}
	@Override
	public void accountNo(String accNo) {
		super.accountNo(accNo);
	}
	@Override
	public void bankBalance(double bBlz) {
		super.bankBalance(bBlz);
	}
	@Override
	public void branchName(String area)	{
		super.branchName(area);
	}
	public static void main(String[]args) {
		Overriding1 ob = new Overriding1();
		ob.name("veni");
		ob.accountNo("863760992910");
		ob.bankBalance(5003.032);
		ob.branchName("Mysore");
	}
	}

