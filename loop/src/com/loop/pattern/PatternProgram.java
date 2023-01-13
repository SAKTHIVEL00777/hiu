package com.loop.pattern;

public class PatternProgram {

	public static void main(String args[]) {
		
		PatternProgram pap=new PatternProgram();
		//pap.pattern1();
		//pap.pattern2();
		//pap.pattern3();
		//pap.pattern4();
		//pap.pattern5();
	    //pap.pattern6();
	    //pap.pattern7();
	    //pap.pattern8();
	    //pap.pattern9();
	    //pap.pattern10();
	    //pap.pattern11();
		//============================
		//pap.pattern12();
		//pap.pattern13();
		//pap.pattern14();
		//pap.pattern15();
        //==========================
		

 }

	private void pattern15() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(""+ " ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

	private void pattern14() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=5-row;col++) {
					System.out.print(""+ " ");
				}
				for(int col=1;col<=row;col++) {
					System.out.print(row+" ");
				}
				System.out.println();
			}
	}

	private void pattern13() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(""+ " ");
			}
			for(int col=row;col>=1;col--) {
				System.out.print(col+ " ");

			}
			System.out.println();
		}
	}

	private void pattern12() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(" "+ " ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(col+ " ");

			}
			System.out.println();
		}
	}

	private void pattern11() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(col+ " ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print(1+ " ");

			}
			System.out.println();
		}
	}

	private void pattern10() {
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=5-row;col++) {
				System.out.print(col+ " ");
			}
			System.out.print(1);
			System.out.println();
		}
	}

	private void pattern9() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=5-row;col++) {
					System.out.print(col+ " ");
				}
				System.out.println();
			}
	}

	private void pattern8() {
			for(int row=5;row>=1;row--) {
				for(int col=row;col>=1;col--) {
					System.out.print(col+ " ");
				}
				System.out.println();
			}
	}

	private void pattern7() {
			for(int row=0;row<=4;row++) {
				for(int col=1;col<=5-row;col++) {
					System.out.print(row+col+ " ");
				}
				System.out.println();
			}
	}

	private void pattern6() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=6-row;col++) {
					System.out.print((row*col)+ " ");
				}
				System.out.println();
			}
	}

	private void pattern5() {
			for(int row=1;row<=5;row++) {
				for(int col=1;col<=6-row;col++) {
					System.out.print(row+ " ");
				}
				System.out.println();
			}
	}

	private void pattern4() {
			for(int row=5;row>=1;row--) {
				for(int col=5;col>=6-row;col--) {
					System.out.print(row+ " ");
				}
				System.out.println();
			}
	}

	private void pattern3() {
			for(int row=5;row>=1;row--) {
				for(int col=5;col>=6-row;col--) {
					System.out.print(col+ " ");
				}
				System.out.println();

			}
	}

	private void pattern2() {
			for(int row=1; row<=5; row++) {
				for(int col=1; col<=6-row;col++) {
					System.out.print(col+ " ");
				}
				System.out.println();
			}		
	}

	private void pattern1() {
			for(int row=1; row<=5;row++) {
				for(int col=1; col<=6-row;col++) {
					System.out.print(1+ " ");
				}
				System.out.println();
			}		
	}
}
