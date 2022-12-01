package com.string;

public class StringClass {

	public static void main(String[] args) {
		StringClass sc=new StringClass();
		  //sc.stringMethods();
		  //sc.countOfChar("virat");
		  //sc.printNoOnly("virat18");
		  //sc.printCharOnly("VIRAT");
		  //sc.countOfVowels("virat");
		  //sc.printSpecialChar("virat&*$@gmail.com");
		  sc.presentChar("virat");
	}

	private void presentChar(String name) {
			char key='a';
			for(int i=0;i<name.length();i++) {
				if(key==name.charAt(i)) {
					System.out.print("yes");
				}
			}
	}

	private void printSpecialChar(String name) {
			for(int i=0;i<name.length();i++) {
			if(!(name.charAt(i)>='0' && name.charAt(i)<='9') && 
			! (name.charAt(i)>=65 && name.charAt(i)<=122)){
				System.out.print(name.charAt(i));
			}
				
			}
	}

	private void countOfVowels(String name) {
			int count=0;
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)=='a'||
				   name.charAt(i)=='e'||
				   name.charAt(i)=='i'||
				   name.charAt(i)=='o'||
				   name.charAt(i)=='u') {
					count++;
				}
			}
			System.out.println("countOfVowels:"+count);
	}

	private void printCharOnly(String name) {
			for(int i=0;i<name.length();i++) {                     //ASII value
				if(name.charAt(i)>=65 && name.charAt(i)<=122) {    //A to Z - 65 to 90
					System.out.print(name.charAt(i));              //a to z - 97 to 122
				}                                                  //0 to 9 - 48 t0 57
			}
	}

	private void printNoOnly(String name) {
			for(int i=0;i<name.length();i++) {
				if(name.charAt(i)>='0' && name.charAt(i)<='9') {
					System.out.print(name.charAt(i));
				}
			}
	}

	private void countOfChar(String name) {
		
			System.out.println(name.length());
	}

	private void stringMethods() {
			String name="sehwag";
			System.out.println(name.charAt(0));
			System.out.println(name.length());
			for(int i=0;i<name.length();i++) {
				System.out.print(name.charAt(i));
			}
	}

}
