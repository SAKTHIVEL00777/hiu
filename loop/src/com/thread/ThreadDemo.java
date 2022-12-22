package com.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		 
		ThreadChild tc=new ThreadChild();
		System.out.println("Before start---->"+tc.getState());
		//tc.run();
		tc.start();  //it starts the thread
		System.out.println("After start---->"+tc.getState());

		for(int i=1;i<=5;i++) {
			
			System.out.println("Thread Demo"+ i);
		}
		
	}
}
