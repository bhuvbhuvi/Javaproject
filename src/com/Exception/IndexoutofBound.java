package com.Exception;

import java.util.ArrayList;
import java.util.List;

public class IndexoutofBound {
	
	public static void main(String[] args) {
		
		List<Integer> o = new ArrayList<>();
	
		o.add(20);
		o.add(30);
		
		Integer integer = o.get(3);
		System.out.println(integer);
	}

}
