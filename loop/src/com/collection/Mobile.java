package com.collection;

public class Mobile implements Comparable{

	String name;
	int price;
	int rom;
	int ram;
	public Mobile(String name, int price, int rom, int ram) {
		///super();
		this.name = name;
		this.price = price;
		this.rom = rom;
		this.ram = ram;
	}
	public String toString() {
		
		return this.name+" "+this.price+" "+this.rom+" "+this.ram;
	}
	@Override
	public int compareTo(Object ob) {
		// TODO Auto-generated method stub
		Mobile m1=(Mobile) ob;
		int price1=m1.price;
		int price2=this.price;
		if(price1<price2) {  //<---asscending order    //if(price1>price2)--->decending order
			return 1;
		}
		
		  else if(price1>price2){ 
			  return -1;
			  
		  }
		 
		return 0;
	}
}
