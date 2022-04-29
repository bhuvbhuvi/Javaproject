package com.Keywords;

public class This_Super extends Static_Keyword {
     int a = 16;
     public void day() {
		int a = 11;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
     }	
     public static void main(String[] args) {
		     This_Super a = new This_Super();
		     a.day();
	}
}
