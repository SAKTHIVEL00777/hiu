package com.exception;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String args[]) {
		ExceptionHandling eh=new ExceptionHandling();
		 //eh.tryCatch();
		 //eh.multipleCatch();
		 //eh.multipleTry();
		 //eh.finallyBlock();
		 //eh.withoutCatch();
		 eh.usingThrows();
		
          //int no1=10; int no2=0; System.out.println(no1/no2);//ArithmeticException

		 	//int[] ar=new int[-3];//NegativeArraySizeException
	    // String s="sehwag";
	      //System.out.println(s.charAt(7));//StringIndexOutOfBoundsException


		 
	}
	void usingThrow() throws FileNotFoundException {
		int no1=0;
		if(no1==0) {
			FileNotFoundException ar=new FileNotFoundException();
			throw ar;
		}
	}
	
	void throws2()throws ArithmeticException,Exception {
		  int avg=10/0;
		  System.out.println(avg);
	}

	
	 void usingThrows() throws ArithmeticException {
		// TODO Auto-generated method stub
		   int avg=10/0;
		   System.out.println(avg);
		
	}


	private void withoutCatch() {
		 	 try {
		 		 System.out.println(10/0);//ArithmeticException
		 	 }
		 	 finally {
                  System.out.println("i am execute exception occurs or not");		 		 
		 	 }
	}


	private void finallyBlock() {
		 	 try {
				System.out.println(10/0);//ArithmeticException
			} 
		 	 catch (Exception e) {
		 		 	System.out.println(e);
		 	 }
		 	 finally {
				System.out.println("i am execute exception occurs or not");
			}
	}


	private void multipleTry() {
		 	 try {
			    System.out.println("hello"+10/5);
			     try {
				      String s="sehwag";
				      System.out.println(s.charAt(7));//StringIndexOutOfBoundsException
				} 
			     catch (StringIndexOutOfBoundsException e) {
			    	 	System.out.println("name index small");
				}
			} 
		 	 catch (ArithmeticException e) {
				System.out.println("0 not use by divisor");
		 	 }
	}


	private void multipleCatch() {
		 	 Scanner sc=new Scanner(System.in);
		 	  System.out.println("enter no");//InputMismatchException
		 	 int no1=0;
		 	 int no2=0;
		 	//int[] ar=new int[3];
		 	 try {
				int[] a=new int[-3];//NegativeArraySizeException
				no1=sc.nextInt();
				no2=sc.nextInt();
				System.out.println(no1/no2);
				//ar[3]=10;
			} 
		 	 catch (ArithmeticException e) {
			      System.out.println("check no2"); 
			  } 
		 	 catch (InputMismatchException e) {
			      System.out.println("enter number only"); 
			  }
			
			 catch(NegativeArraySizeException e) {
			      System.out.println("should be not index negative"); 
			   }
				 
		 	 catch (Exception e) {
				System.out.println(e);			
				}
	}


	private void tryCatch() { 
		 // TODO Auto-generated method stub 
		 int no1=10; 
		 int no2=0;
	   try { 
		   System.out.println(no1/no2);
		   } 
	 catch (ArithmeticException e) {
	      System.out.println("check no2"); 
	  } 
   }
}
