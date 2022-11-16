package com.task;

public class LoopingTask {

	public static void main(String[] args) {
		LoopingTask task=new LoopingTask();
		//task.First_N_primeNo();
		//System.out.println("--------------");
		//task.First_N_DoubleDigit();
		//task.divisorOf100(100);
		//task.primeOrNot(13);
		//task.divisorOf100OnlyPrime(100);
		//task.reverseNo(456789);
		//task.reverseNo2(456789);
		//task.powerOf5(2,5);
		//task.powerOfNo(2,5);
		//task.threeSwappingNo(5,6,7);
		//task.fourSwappingNo(5,6,7,8);
	    //task.powerOfcube(1);
		task.oddOfCube(1);
		//task.powerOfSameNo(1,1);
	}

	private void oddOfCube(int no) {
			while(no<=5) {
				if(no%2!=0) {
				int result=no*no*no;
				System.out.print(result+ " ");
			}
			no++;
		}
				
	}

	private void powerOfcube(int no) {
			while(no<=4) {
				int result=no*no*no;
				System.out.print(result+ " ");
				no++;
			}
				
	}

	private void fourSwappingNo(int a, int b, int c, int d) {
		
		System.out.println("before swapping---> "+"a="+a+" b="+b+" c="+c+" d="+d);
		a=a+b+c+d;
		b=a-(b+c+d);
		c=a-(b+c+d);
		d=a-(b+c+d);
		a=a-(b+c+d);
		System.out.println("after swapping---> "+"a="+a+" b="+b+" c="+c+" d="+d);
	}

	private void threeSwappingNo(int a, int b, int c) {
		
			System.out.println("before swapping-->"+"a="+a+" b="+b+" c="+c);
			a=a+b+c;
			b=a-(b+c);
			c=a-(b+c);
			a=a-(b+c);
			System.out.println("after swapping--> "+"a="+a+" b="+b+" c="+c);
	}

	private void powerOfNo(int no, int power) {
			while(0<power) {
				int result=powerOf5(no,power);
				System.out.println(no+ "power of "+power+"=result");
				power--;
			}
	}

	private int powerOf5(int no, int power) {
			int result=1;
			while(0<power) {
				result=result*no;
				power--;
			}
			//System.out.println(result);
			return result;
	}

	private void reverseNo2(int no) {
			int rev=0;
			while(0<no) {
				int rem=no%100;
				rev=(rev*100)+rem;
				no=no/100;
			}
			System.out.println(rev);
	}

	private void reverseNo(int no) {
			int reverse=0;
			while(0<no) {
				int rem=no%10;
				reverse=(reverse*10)+rem;
				no=no/10;
			}
			System.out.println("reverse no "+ reverse );
	}

	private void divisorOf100OnlyPrime(int no) {
			int div=2;
			while(div<no) {
				if(no%div==0) {
					primeOrNot(div);
				}
				div++;
			}
	}

	private void primeOrNot(int no) {
			int div=2;
			boolean check=true;
			while(div<no) {
				if(no%div==0) {
					check=false;
				}
				div++;
			}
			if(check) {
				System.out.println(no + " is Prime no");
			}
	}

	private void divisorOf100(int no) {
			int div=2;
			while(div<no) {
				if(no%div==0) {
					System.out.println(div+" ");
					//primeOrNot(div);
				}
				div++;
			}
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
