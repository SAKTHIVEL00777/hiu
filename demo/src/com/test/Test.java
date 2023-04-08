package com.test;

public class Test {

	 int aa=100;
	 static String city="TRICHY";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Test t=new Test();
             //t.variable();
             //t.reverse();
             //t.allFactorials();
             //t.factorial(5);
             t.palindrome("AMMA");
            
	}

	private void palindrome(String str) {
		// TODO Auto-generated method stub
		String name="";
		for(int i=str.length()-1;i>=0;i--) {
			name=name+str.charAt(i);
		}
		if(str.equals(name)) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");

		}
		
	}

	private void factorial(int no) {
		// TODO Auto-generated method stub
		int count=1;
		while(no>0) {
			count=count*no;
			no=no-1;
		}
		System.out.println(count);
		
	}

	private void allFactorials() {
		// TODO Auto-generated method stub
		int fact=5;
		while(0<fact) {
			System.out.println(fact);
			fact=fact-1;
		}
		
	}

	private void reverse() {
		// TODO Auto-generated method stub
		String name="dhoni";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
	}

	private void variable() {
		// TODO Auto-generated method stub
		int a=25;
		String name="DHONI";
		Float f=15f;
		double d=102d;
		long ll=907547821;
		char let='C';
		Boolean boo=true;
		final int my=20;
		
		
		System.out.println(a);
		System.out.println(name);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ll);
		System.out.println(let);
        System.out.println(boo);
        System.out.println(my);
		System.out.println(aa);
		System.out.println(city);
		
	}
	

}
