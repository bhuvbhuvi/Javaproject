package org.Abstration;

public class Insurance2 implements Insurance {
	@Override
	public void Insurancename() {
		System.out.println("Insurancename");
		System.out.println("lic");

	}

	@Override
	public void Insurancecovermember() {
		System.out.println("Insurancecovermember");
		System.out.println("5");
	}

	@Override
	public void InsuranceEMI() {
		System.out.println("InsuranceEMI");
		System.out.println(24);
	}

	@Override
	public void Insurancepremium() {
		System.out.println("Insurancepremium");
		System.out.println(25000);
	}

	@Override
	public void Insurancedisease() {
		System.out.println("Insurancedisease");
		System.out.println("Dengu");
	}
	public static void main(String[] args) {
		Insurance2 o = new Insurance2();
		
		o.Insurancename();
		o.InsuranceEMI();
		o.Insurancedisease();
		o.Insurancecovermember();
		o.Insurancepremium();
		
	}
}
