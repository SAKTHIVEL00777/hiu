package com.interview;

public class Interview {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interview in=new Interview();
		in.reverse();
		
	}

	private void reverse() {
		// TODO Auto-generated method stub
		String name="virat";
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		
	}

}
