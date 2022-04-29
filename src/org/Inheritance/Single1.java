package org.Inheritance;

public class Single1 extends Single {
	public void son() {
		System.out.println("Navish");
    
}
	public static void main(String[]args) {
 	   Single1 o = new Single1();
 	   
 	   o.son();
 	   o.mother();
 	   o.sister();
	}
}
