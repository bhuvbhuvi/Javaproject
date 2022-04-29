package org.String;

public class splitwithLength {
	public static void main(String[] args) {
		
		String o = "Good morning friends";
		String[] split = o.split("",9);
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}
	}


