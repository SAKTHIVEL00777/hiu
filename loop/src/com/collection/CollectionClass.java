package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class CollectionClass {
	
	public static void main(String[] args) {
      
		CollectionClass cc=new CollectionClass();
		//cc.ArrayList();
		//cc.addTwoArray();
		//cc.linkedList();
        //cc.hashSet();	
        //cc.linkedHashSet();
        //cc.treeSet();
        //cc.iterationMethod();
        //cc.sunOfNumber();
        //cc.removeDuplicate();
        //cc.printDuplicate();
        //cc.yesOrNo();
        cc.printIntegerOnly();
		
	}

	private void printIntegerOnly() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("aa");
		al.add(17.7f);
		al.add(112.97d);
		al.add(true);
		al.add(18);
		for(Object ob:al) {
			try {
				Integer i=(Integer) ob;
				System.out.println(i);
			} 
			catch (Exception e) {
				//System.out.println("i am not int");
			}
		}		
	}

	private void yesOrNo() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("continue or not");
	    String str=sc.next();
		ArrayList al=new ArrayList();
		while(str.equals("y")) {
			System.out.println("enter number");
			Integer no=sc.nextInt();
			al.add(no);
			System.out.println("continue or not");
			str=sc.next();
		}
		System.out.println(al);
		
	}

	private void printDuplicate() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
	    al.add(1);
	    al.add(5);
	    al.add(5);
		al.add(11);
		al.add(11);
		al.add(17);
		LinkedHashSet ll=new LinkedHashSet();
		for(Object ob:al) {
		    boolean dup=ll.add(ob);
		      if(dup==false) {
		          System.out.println(ob);
		       }
		  }
	}

	private void removeDuplicate() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
        al.add(1);
        al.add(5);
        al.add(5);
        al.add(11);
        al.add(11);
        al.add(17);
        System.out.println(al);
        LinkedHashSet ll=new LinkedHashSet(al);
        System.out.println(ll);
		
	}

	private void sunOfNumber() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(6);
		al.add(5);
		al.add(12);
		al.add(1);
		al.add(18);
		int total=0;
		for(Object ob:al) {
			Integer i=(Integer) ob;
			total+=i;
		}
		System.out.println(total);
	}

	private void iterationMethod() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(6);
		al.add(5);
		al.add(12);
		al.add(1);
		al.add(18);
		for(Object ob:al) {
			Integer i=(Integer) ob;
			if(i%6==0) {
				System.out.println(ob);
			}
		}
		
	}

	private void treeSet() {
		// TODO Auto-generated method stub
		TreeSet hs=new TreeSet();
		hs.add("kavin");
		hs.add("sehwag");
		hs.add("vk");
		hs.add("vk");
		//hs.add(null);
		hs.add("sachin");
		System.out.println(hs);
		
	}

	private void linkedHashSet() {
		// TODO Auto-generated method stub
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("kavin");
		hs.add(10);
		hs.add(10);
		hs.add(null);
		hs.add("sehwag");
		System.out.println(hs);	
	}

	private void hashSet() {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("kavin");
		hs.add(10);
		hs.add(10);
		hs.add(null);
		hs.add("sehwag");
		System.out.println(hs);
		
	}

	private void linkedList() {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.add("kavin");
		ll.add("kavin");
		ll.add(10);
		ll.add(null);
		LinkedList ll1=new LinkedList();
		ll1.add("kavin");
		ll1.add("kumar");
		ll1.add(12);
		ll.addAll(ll1);
		System.out.println(ll);
		
	}

	private void addTwoArray() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("sehwag");
		al.add("sehwag");
		al.add(true);
		al.add(null);
		ArrayList al2=new ArrayList();
		al2.add("sachin");
		al2.add(12);
		al.add(false);
		
		al.addAll(al2);
		System.out.println(al);
		
		
	}

	private void ArrayList() {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("sakthi");
		al.add(true);
		al.add(5.6f);
		al.add('a');
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.contains("sakthi"));
		al.remove(3);
		System.out.println(al);
		
	}

}
