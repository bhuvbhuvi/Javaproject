package com.Polymorphism;

public class Overriding {
	public void name(String name) {
		System.out.println(name);
	}
     public void accountNo(String accNo) {
    	 System.out.println(accNo);
     }
    public void bankBalance(double bBlz) {
    	System.out.println(bBlz);
    }
     public void branchName(String area){
    	 System.out.println(area);
     }
     public static void main(String[] args) {
		Overriding o = new Overriding();
		      o.name("sasi");
		      o.accountNo("785690234561");
		      o.bankBalance(5000.30);
		      o.branchName("chennai");
				
	}
     
}
