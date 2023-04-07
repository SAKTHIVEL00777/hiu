package com.interview;

public class Interview {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interview in=new Interview();
		//in.reverse();
		//in.swappingNo();
		//in.vowels("kavinkumar");
		//in.primeNo();
		//in.fibonacci(25);
		//in.palindrome("DAD");
		//in.factorial();
		//in.allFactorials();
		
		
	}
	
	private void allFactorials() {
		// TODO Auto-generated method stub
		int fact=5;
		while(fact>0) {
			System.out.print(fact+" ");
			fact=fact-1;
		}
		
	}

	private void factorial() {
		// TODO Auto-generated method stub
		int fact=5;
		int count=1;
		while(fact>0) {
			count=count*fact;
			fact=fact-1;
		}
		System.out.println(count);		
		
	}

	private void palindrome(String str) {
		// TODO Auto-generated method stub
		String name="";
		for(int i=str.length()-1;i>=0;i--) {
			name=name+str.charAt(i);
			
		}
		if(str.equals(name)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}

	
	private void fibonacci(int no) {
		// TODO Auto-generated method stub
		int first=0;
		int second=1;
		int third=0;
		while(first<no) {
			third=first+second;
			first=second;
			second=third;
			System.out.println(first+ " ");
		}
		
	}
	
	
	private void primeNo() {
		// TODO Auto-generated method stub
		int no=17;
		int div=2;
		int count=0;
		while(div<no) {
			if(no%div==0) {
				count=count+1;
			}
			div=div+1;
		}
		if(count==0) {
			System.out.println(no+" is prime number");
		}
		else {
			System.out.println(no+" is not prime number");
		}
		
	}
	
	private void vowels(String str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
				System.out.print(str.charAt(i)+" ");
		}
		
	}

	private void swappingNo() {
		// TODO Auto-generated method stub
		int no1=21;
		int no2=33;
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println(no1+"     "+no2);	
	}

	private void reverse() {
		// TODO Auto-generated method stub
		String name="virat";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
	}

}
