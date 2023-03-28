package com.interview;

public class Interview {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interview in=new Interview();
		//in.reverse();
		//in.swappingNo();
		in.vowels("kavinkumar");
		
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
