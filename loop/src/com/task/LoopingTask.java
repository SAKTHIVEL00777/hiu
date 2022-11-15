package com.task;

public class LoopingTask {

	public static void main(String[] args) {
		LoopingTask task=new LoopingTask();
		task.First_N_primeNo();
		//System.out.println("-----------");
		task.First_N_DoubleDigit();
	}

	private void First_N_DoubleDigit() {
			int no=2;
			int primeCount=0;
		
			while(primeCount<14) {
			 int div=2;
		   	  int count=0;
			
				while(div<no) {
				
				if(no%div==0) {
					count=count+1;
					break;
				}
				div=div+1;
			}
			if(count==0) {
				
				if(div>9) {
					System.out.print(div + " ");
				}
				primeCount=primeCount+1;
			}
			   no=no+1;
		}
}

	private void First_N_primeNo() {
			int no=2;
			int primeCount=0;
			
			while(primeCount<10) {
				int div=2;
				int count=0;
				
				while(div<no) {
					
					if(no%div==0) {
						count=count+1;
						break;
					}
					div=div+1;
				}
				if(count==0) {
					System.out.print(div + " ");
					primeCount=primeCount+1;
					
				}
				   no=no+1;
			}
			System.out.println();
	}

}
