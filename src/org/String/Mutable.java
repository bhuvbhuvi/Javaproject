package org.String;

public class Mutable {
public static void main(String[] args) {
	StringBuffer  o = new StringBuffer("Sudha");
	StringBuffer  o1 = new StringBuffer("Sudha");
	StringBuffer  o2 = new StringBuffer("Student");
	
	System.out.println(System.identityHashCode(o));
	System.out.println(System.identityHashCode(o1));
	System.out.println(System.identityHashCode(o2));
	
	System.out.println("==After Append==");
	StringBuffer o3 = o.append(o1);
	System.out.println(System.identityHashCode(o3));
	
	
}
}
