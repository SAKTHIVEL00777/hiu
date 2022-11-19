package com.loop.pattern;

public class PatternProgram2 {

	public static void main(String args[]) {
		
		PatternProgram2 pa2=new PatternProgram2();
		//pa2.pattern1();
		//pa2.pattern2();
		//pa2.pattern3();
		//pa2.pattern4();
		//pa2.pattern5();
		//pa2.pattern6();
		//pa2.pattern7();
		//pa2.pattern8();
		//pa2.pattern9();
		//==================
		//pa2.pattern10();
		//pa2.pattern11();
  }

	private void pattern11() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print(" "+" ");
				}
				for(int col=1;col<=6-row;col++) {
					System.out.print(col+" ");
				}
				System.out.println();
			}
	}

	private void pattern10() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print(col+" ");
				}
				for(int col=1;col<=6-row;col++) {
					System.out.print(col+" ");
				}
				System.out.println();
			}
	}
	private void pattern9() {
		
	}

	private void pattern8() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=row-1;col++) {
					System.out.print(col+" ");
				}
				System.out.print(1);
				System.out.println();
			}
	}

	private void pattern7() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=row-1;col++) {
					System.out.print(col+" ");
				}
				System.out.println();
			}
	}

	private void pattern6() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print(col+" ");
				}
				System.out.println();
			}
	}

	private void pattern5() {
			for(int row=5;row>=1;row--) {
				for(int col=row;col<=5;col++) {
					System.out.print(col+" ");
				}
				System.out.println();
			}
	}

	private void pattern4() {
			for(int row=5;row>=1;row--) {
			   for(int col=5;col>=row;col--) {
				   System.out.print(row+" ");
			   }
			   System.out.println();
			}
	}

	private void pattern3() {
			for(int row=5;row>=1;row--) {
				for(int col=5;col>=row;col--) {
					System.out.print(col+" ");
				}
				System.out.println();
			}
	}

	private void pattern2() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print(col+" ");
				}
				System.out.println();
			}
	}

	private void pattern1() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=row;col++) {
					System.out.print(1+" ");
				}
				System.out.println();
			}
	}
}
