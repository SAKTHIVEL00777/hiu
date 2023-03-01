package com.demo;

public interface InterDemo {
	 String ADDRESS="TRICHY"; ///by default static and final
	void add();  	///by default abstract method
	void multiple();
	
	default void show() {
		System.out.println("INTERFACE SHOW");
	}
	static void subtract() {
		System.out.println(50-20);
	}

}
