package org.String;

public class Repeted {
	public static void main(String[] args) {
		String s = "fear leads to anger anger leads to hatred";
		String[] sp = s.split(" ");
		for (String st : sp) {
			System.out.println(st);
			
		}
	}

}
