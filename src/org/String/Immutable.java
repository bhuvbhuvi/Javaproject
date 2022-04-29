package org.String;

public class Immutable {
	public static void main(String[] args) {
		String o = "veni";
		String o1 = "veni";
		String o2 = "name";
		
		System.out.println(System.identityHashCode(o));
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		
		
		System.out.println("===After Concat===");
		String o3 = o.concat(o2);
		System.out.println(System.identityHashCode(o3));
		
		
	}

}
