package com.ControlSelectionJumpingStatement;

public class BreakandContinue {
	public static void main(String[] args) {
		for (int i = 1; i <=20; i++) {
			if(i==15) {
			break;
			}
			System.out.println(i);
		}
		System.out.println();
		System.out.println();
		
		for (int i = 21; i <=40; i++) {
			if (i==35) {
				continue;
				
			}
			System.out.println(i);
		}
			
		}
	}


