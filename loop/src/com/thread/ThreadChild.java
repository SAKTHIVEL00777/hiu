package com.thread;

public class ThreadChild extends Thread{

	public void run() {
		
		System.out.println("Before start---->"+this.getState());

		for(int i=1;i<=5;i++){
			
			System.out.println("Thread Child"+ i);
		}
	}

}
