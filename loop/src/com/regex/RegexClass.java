package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
	
	public static void main(String args[]) {
		RegexClass rc=new RegexClass();
		//rc.regex1();
		//rc.regex2();
		//rc.regex3();
		//rc.regex4();
		//rc.regex5();
		rc.regex6();
	}

	private void regex6() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anything here:");
		String input=sc.nextLine();
		Pattern patternobj=Pattern.compile("(0|91)?[6-9][0-9]{9}");

		Matcher matcherobj=patternobj.matcher(input);
		while(matcherobj.find()) {
			System.out.println(matcherobj.group());
		}

	}

	private void regex5() {
		// TODO Auto-generated method stub
		String input="sakthi00@gmail.com";
		//Pattern patternobj=Pattern.compile("[a-z]");
		//Pattern patternobj=Pattern.compile("[0-9]");
		//Pattern patternobj=Pattern.compile("[a-z0-9]");
		Pattern patternobj=Pattern.compile("[^a-z0-9]");

        Matcher matcherobj=patternobj.matcher(input);
		while(matcherobj.find()) {
			System.out.print(matcherobj.group());
		}
		
	}

	private void regex4() {
		// TODO Auto-generated method stub
		String input="abcd abcd abcd abcd abc bc abc";
		Pattern patternobj=Pattern.compile("[^abc]");
		Matcher matcherobj=patternobj.matcher(input);
		while(matcherobj.find()) {
			System.out.print(matcherobj.group());
		}
		
		
	}

	private void regex3() {
		// TODO Auto-generated method stub
		String input="abcd abcd abcd abcd abc bc abc";
		Pattern patternobj=Pattern.compile("[abc]");
		Matcher matcherobj=patternobj.matcher(input);
		while(matcherobj.find()) {
			System.out.print(matcherobj.group());
		}
		
	}

	private void regex2() {
		// TODO Auto-generated method stub
		String input="abcd abcd abcd abcd abc bc abc";
		Pattern patternobj=Pattern.compile("abc");
		Matcher matcherobj=patternobj.matcher(input);
		while(matcherobj.find()) {
			System.out.println(matcherobj.group());
		}
	}

	private void regex1() {
		// TODO Auto-generated method stub
		String input="abcd abcd abcd abcd abc bc abc";
		Pattern patternobj=Pattern.compile("abc");
		Matcher matcherobj=patternobj.matcher(input);
		System.out.println(matcherobj.find());
	}

}
