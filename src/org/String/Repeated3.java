package org.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.w3c.dom.Entity;

public class Repeated3 {
	public static void main(String[] args) {
		String s = "fear leads to anger anger leads to hatred";
		
		String[] sp = s.split(" ");
	    Map<String, Integer> m = new LinkedHashMap<>();
	    for (String st : sp) {
	   if(m.containsKey(st)) {
		   Integer in = m.get(st);
		           m.put(st,in+1);
	   }
	    else {
		   m.put(st, 1);
	   }
	    }
	
	  Set<Entry <String, Integer>> entryset = m.entrySet();
       for (Entry <String, Integer> entry:entryset) {
    	   if(entry.getValue()>1) {
    		   System.out.println(entry);
    	   }
    	   }
	}
}
       
       
       
       

