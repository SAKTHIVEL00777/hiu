package com.loop.pattern;

public class LetterPattern {
	
	public static void main (String args[]) {
		
		LetterPattern lp=new LetterPattern();
		//lp.printS();  
	}

	private void printS() {
			for(int col=1;col<=5;col++) {
				if(col==1) {
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println();
			for(int row=1;row<=3;row++) {
				System.out.println("* ");
			}
			for(int col=1;col<=5;col++) {
				if(col==1) {
					System.out.print(" ");
				}
				System.out.print("* ");
			}
			System.out.println();
			for(int row=1;row<=3;row++) {
				for(int space=1;space<=5;space++) {
					System.out.print("  ");
				}
				System.out.println("* ");
			}
			for(int col=1;col<=5;col++) {
				if(col==1) {
					System.out.print(" ");
				}
				System.out.print("* ");
			}
 }
	
}


