package org.Collection;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Mapmethods {
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
         System.out.println(o);
         
           Object get = o .get(3);
           System.out.println(get);
           
           boolean containskey = o.containsKey(4);
            System.out.println(containskey);
            int size = o.size();
            System.out.println(size);
            
            Set<Integer> KeySet = o.keySet();
             System.out.println(KeySet);
             
             Collection<Object> value = o.values();
             System.out.println(value);
             
             Set<java.util.Map.Entry<Integer, Object>> entrySet = o.entrySet();
             for (java.util.Map.Entry<Integer, Object> entry : entrySet) {
            	 System.out.println(entry);
				
			}
}
	}
}
		
	
