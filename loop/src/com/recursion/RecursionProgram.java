package com.recursion;

public class RecursionProgram {

	public static void main(String[] args) {
		
		RecursionProgram rep=new RecursionProgram();
		
		System.out.println(rep.factorial(5));
	
		rep.print1111(4);
		//System.out.println();
     	rep.print1234(1);
	}

	private int print1234(int no) {
			System.out.println(no);
			no=no+1;
			if(no<=4) {
				return print1234(no);
			}
			return no;
	}

	private int print1111(int no) {
			System.out.println(1);
			no=no-1;
			if(no>0) {
				return print1111(no);
			}
			return no;
			
				
	}

	private int factorial(int no) {
			if(no==1) {
				return 1;
			}
			else {
				return no*factorial(no-1);
			}
				
	}

}
