package com.ControlSelectionJumpingStatement;

public class Switch {
	public static void main(String[] args) {
		int c = 70;
		switch(c) {
		case 5:
			System.out.println("Sunday");
			break;
		case 10:
			System.out.println("Monday");
			break;
		case 15:
			System.out.println("Tuesday");
			break;
		case 20:
		   System.out.println("Wednesday");
		   break;
		case 25:
			System.out.println("Thursday");
			break;
		case 30:
			System.out.println("Friday");
		break;
		case 65:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("sunday to saturday");
				break;
		}
	}

}
