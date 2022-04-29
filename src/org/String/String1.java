package org.String;

public class String1 {
	public static void main(String[] args) {

		String a = "The car came here";
		String b = "He ran so fast";

		int length = a.length();
		System.out.println(length);
		int length1 = b.length();
		System.out.println(length1);

		boolean equals = a.equals("The car came here");
		System.out.println(equals);
		boolean equals1 = b.equals("He ran fast");
		System.out.println(equals1);

		boolean EIC = a.equalsIgnoreCase("The Car came here");
		System.out.println(EIC);
		boolean EIC1 = b.equalsIgnoreCase("He ran fast");
		System.out.println(EIC1);

		int letter = a.indexOf('e');
		System.out.println(letter);
		int word = b.indexOf('f');
		System.out.println(word);

		int last = a.lastIndexOf('r');
		System.out.println(last);
		int last1 = b.lastIndexOf('t');
		System.out.println(last1);

		boolean contains = a.contains("the");
		System.out.println(contains);
		
		boolean contains1 = b.contains("he");
		System.out.println(contains1);

		char charAt = a.charAt(8);
		System.out.println(charAt);
		char charAt1 = b.charAt(9);
		System.out.println(charAt1);

		String uppercase = a.toUpperCase();
		System.out.println(uppercase);
		String uppercase1 = b.toUpperCase();
		System.out.println(uppercase1);

		String lowercase = a.toLowerCase();
		System.out.println(lowercase);
		String lowercase1 = b.toLowerCase();
		System.out.println(lowercase1);

		boolean starts = a.startsWith("The");
		System.out.println(starts);
		boolean starts1 = b.startsWith("He");
		System.out.println(starts1);

		boolean ends = a.endsWith("here");
		System.out.println(ends);
		boolean ends1 = b.endsWith("fast");
		System.out.println(ends1);
	}
}
