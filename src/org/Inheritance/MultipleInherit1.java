package org.Inheritance;

public class MultipleInherit1 extends Single implements MultipleInherit {

	@Override
	public void daughter() {
		System.out.println("sugu");
	}
	@Override
	public void son() {
	   System.out.println("Navish");
	}
	public static void main(String[]args) {
		MultipleInherit1 o = new MultipleInherit1();
		    o.daughter();
		    o.mother();
		    o.sister();
		    o.son();
		    
		    
		    
		    
	}

}
