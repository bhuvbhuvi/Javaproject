package org.Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapLinkedmap {
	public static void main(String[] args) {
		Map<Integer, Object> o = new LinkedHashMap<>();
		o.put(2, 20);
		o.put(3, "java");
		o.put(1, "goodmorning");
		o.put(0, 1);
		o.put(4, 25);
		o.put(10, 50);
		o.put(5, 60);
		o.put(5, 65);
		o.put(null, 88);
		o.put(7, null);
		o.put(7, 80);
		o.put(null, null);
		o.put(null, 90);
		o.put(9, 99);
		System.out.println(o);
		
	}

}
