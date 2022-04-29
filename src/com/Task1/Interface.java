package com.Task1;

public class Interface implements Interface1{
	@Override
	public void Bankpremium() {
		System.out.println("Bankpremium");
           System.out.println(24000);
	}
	@Override
	public void BankEMI() {
		System.out.println("BankEMI");
		System.out.println(12);
	}
	@Override
	public void BankIntrest() {
		System.out.println("BankInterest");
		System.out.println("12%");
	}
	@Override
	public void Bankname() {
		System.out.println("Bankname");
		System.out.println("cub");
	}
	@Override
	public void Bankloan() {
		System.out.println("Bankloan");
		System.out.println("bikeloan");
		
	}
	public static void main(String[] args) {
		Interface O = new Interface();
		
		O.Bankname();
		O.Bankpremium();
		O.BankEMI();
		O.BankIntrest();
		O.Bankloan();
		
	}
}