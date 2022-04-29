package com.Scanner;

import java.util.Scanner;

public class DetailsScanner {
	public static void main(String[] args) {
		Scanner bio = new Scanner(System.in);
		String nextline = bio.nextLine();
		    System.out.println(nextline);
		    
		    String name = bio.next();
		    System.out.println(name);
		    int age = bio.nextInt();
		    System.out.println(age);
		    double loan = bio.nextDouble();
		    System.out.println(loan);
		    float car = bio.nextFloat();
		    System.out.println(car);
		    long travel = bio.nextLong();
		    System.out.println(travel);
		    String name1 = bio.next();
		    System.out.println(name1);
		    String next = bio.next();
		    System.out.println("Next name:" +next);
		    }

}
