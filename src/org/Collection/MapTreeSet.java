package org.Collection;

import java.util.Map;
import java.util.TreeMap;

public class MapTreeSet {
public static void main(String[] args) {
	Map<Integer,Object> o = new  TreeMap<>();
	o.put(1, 0);
	o.put(2, 10);
	o.put(3, 20);
	o.put(1, "sasi");
	o.put(4, 50);
	o.put(0, 25);
	o.put(5, 60);
	System.out.println(o);
	
}
}
