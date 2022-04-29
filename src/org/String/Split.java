package org.String;

public class Split {
public static void main(String[] args) {
	
	String o = "Good morning friends";
	String[] split = o.split("");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
}
}
