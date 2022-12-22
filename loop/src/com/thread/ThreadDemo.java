package com.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		ThreadChild tc=new ThreadChild();
		//tc.run();
		System.out.println(tc.getState());
		tc.start();   //it starts the thread
		
		for(int i=1;i<=5;i++) 
		{
		System.out.println("Thread Demo"+ i);
		}
	}
}
