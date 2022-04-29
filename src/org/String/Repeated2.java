package org.String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repeated2  {
	
public static void main(String[] args) {
		String s = "fear leads to anger anger leads to hatred";
		
		String[] sp = s.split(" ");
	    Map<String, Integer> m = new LinkedHashMap<>();
	    for (String st : sp) {
	   if(m.containsKey(st)) {
		   Integer in = m.get(st);
		           m.put(st, 1);
	   }
	    else {
		   m.put(st, 1);
	   }
	    }
	    System.out.println(m);
	}
}
	

