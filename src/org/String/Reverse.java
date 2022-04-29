package org.String;

public class Reverse {
public static void main(String[] args) {
	
	String s = "Good morning have a nice day";//28
	
	for (int i = s.length()-1; i>=0; i--) {
		char charAt = s.charAt(i);
		System.out.println(charAt);
		
	}
}
}
