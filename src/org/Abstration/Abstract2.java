package org.Abstration;

public  class Abstract2 extends Abstract1 {
	@Override
	public void bikeloan() {
		System.out.println("bikeloan - 15% P.A");
	}
@Override
public void homeloan() {
	System.out.println("homeloan - 25% P.A");	
}
@Override
public void goldloan() {
	System.out.println("goldloan - 60% P.A");
	}
@Override
public void personalloan() {
	System.out.println("personalloan - 50%P.A");
	
}
public static void main(String[] args) {
	Abstract2 o = new  Abstract2();
	         
	o.TypesofBankLoan();
	o.carloan();
	o.bikeloan();
	o.homeloan();
	o.goldloan();
	o.personalloan();
	o.medicalloan();
	
}
}
