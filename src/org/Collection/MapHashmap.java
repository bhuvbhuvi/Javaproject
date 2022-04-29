package org.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapHashmap {
	public static void main(String[] args) {
		Map<Integer, Object> o = new HashMap<>();
		o.put(2, 20);
		o.put(3, "java");
		o.put(1, "goodmorning");
		o.put(0, 1);
		o.put(4, 25);
		o.put(10, 50);
		o.put(5, 60);
		o.put(5, 65);
		System.out.println(o);
	}

}
