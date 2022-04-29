package com.ControlSelectionJumpingStatement;

import java.util.Scanner;

public class Elseif {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.next();
		System.out.println("Enter your age");
		int age = s.nextInt();
		
		if (age<17) {
			System.out.println("Not Eligibility to vote ");
		}
		else if (age>17 && age<40) {
			System.out.println("Eligible to vote");
		}
		else if (age>20 || age<45) {
			System.out.println("she is Eligibility to vote");
			
		}
		else {
			System.out.println("Junior citizen");
		}
		
	}

}
