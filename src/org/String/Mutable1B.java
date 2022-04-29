package org.String;

public class Mutable1B {
	public static void main(String[] args) {
		StringBuilder o = new StringBuilder("Software");
		StringBuilder o1 = new StringBuilder("Software");
		StringBuilder o2 = new StringBuilder("technology");
		
		System.out.println(System.identityHashCode(o));
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		
		System.out.println("==AfterAppend==");
		StringBuilder o3 = o.append(o1);
		System.out.println(System.identityHashCode(o3));
		
	}

}
