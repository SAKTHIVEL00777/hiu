package com.object;

public class ObjectClass {
      	String name,city;
      	int age;
	public ObjectClass(String name, int age,String city) {
		// TODO Auto-generated constructor stub
		 this.name=name;
		 this.age=age;
		 this.city=city;
	}

	public static void main(String[] args) {
		ObjectClass oc=new ObjectClass("shewag",37,"Delhi");
		ObjectClass oc1=new ObjectClass("sachin",39,"Mumbai");
		System.out.println(oc.equals(oc1));
		System.out.println(oc.hashCode()+" "+oc1.hashCode());
		System.out.println(oc);
		System.out.println(oc1);
	}
	public String toString() {
		return this.name+" "+this.age+" "+this.city;
	
		
	}

}
