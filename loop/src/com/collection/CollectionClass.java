package com.collection;

import java.util.ArrayList;

public class CollectionClass {
	
	public static void main(String[] args) {
      
		CollectionClass cc=new CollectionClass();
		cc.ArrayList();
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
