package com.loop;

public class Loop {
	
		public static void main(String args[]) {
			
		//	System.out.println("WHILE LOOP PROGRAMS");
			
			Loop loop=new Loop();
			
			//loop.printOne();
			//loop.print12345();
			//loop.multiples3AND5();/
			//loop.multiples3OR5();
			//loop.sum_of_first_n_numbers();
			//loop.find_divisors(100);  //divide of 100
			//loop.count_of_divisors(100);  //count of 100
			//loop.primeOrNot(14);   
			//loop.reverseOrder(5674);
			//loop. noOfReverseNumber();
			//loop.sumOfReverseNumber();
			//loop.count_of_digits(5674);
			//loop.sum_of_digits(1234); 
			//loop.commonDivisor();
			//loop.greatestCommonDivisor();
			//loop.reverseInteger();
			//loop.palindrome();
			//loop.factorial(5);
			//loop.allFactorials();
			//loop.multiple1To10();//10/
			//loop.multiple11();
			//loop.powerOfCube();
			//loop.powerOfSquare();
			//loop.amstrongNo();
			//loop.neonNumber();
			//loop.strongNo();
			//loop.find_First_N_PrimeNo();
			//loop.findSquareRoot();
			//loop.smallestDivisor();
		   	//loop.greatestDivisor();
			//loop.samePowerOfNumber();
			//loop.perfectNumber();
		    //loop.spyNumber();
			//loop.powerOfNumber(2,5);
			//loop.binaryToDecimal();
			//loop.decimalToBinary(7);
			//loop.swappingNo();
			//loop.swappingNoWithoutThirdVariable();
			//loop.fibonaci(25);
			//loop.findLCM();
			// loop.singleDigit(99);
			//loop.printNoSeries();
			}
		
			/*
			 * private void printNoSeries() { int no1=10; int no2=8; while(no2>=0) {
			 * System.out.println(no1+ " "); no1=no1+no2; no2=no2-2; } }
			 */

			private void singleDigit(int no) {
					int sum=0;
					while(0<no) {
						int rem=no%10;
						sum=sum+rem;
						no=no/10;
					}
					if(sum>9) {
						singleDigit(sum);
					}
					else {
						System.out.println(sum);
					}
		}

			private void findLCM() {
			        int no1=3;
			        int no2=6;
			        int max=no1>no2?no1:no2;
			        while(true) {
			        	if(max%no1==0 && max%no2==0) {
			        		System.out.println(max);
				        	break;
			        	}
                           max=max+1;
			        	
			        }

		}

			private void fibonaci(int no) {
				int first=0;
				int second=1;
				int third=0;
				while(first<no) {
					System.out.print(first+ " ");
					third=first+second; 
					first=second;
					second=third;
				}
						
		}

			private void swappingNoWithoutThirdVariable() {
					int no1=25;
					int no2=32;
					no1=no1+no2;
					no2=no1-no2;
					no1=no1-no2;
					System.out.println(no1+ "-----"+no2);
		}

			private void swappingNo() {
					int no1=27;
					int no2=37;
					int add=no1+no2;
					no2=add-no2;
					no1=add-no1;
					System.out.println(no1+ "-------- "+no2);
		}

			private void decimalToBinary(int no) {
					String binary="";
					while(0<no) {
						int rem=no%2;
						binary=rem+binary;
						no=no/2;
					}
					System.out.println(binary);
						
		}

			private void binaryToDecimal() {
			        int binary=111;
			        int power=0;
			        int base=2;
			        int result=0;
			        while(binary>0) {
			        	int rem=binary%10;
			        //	rem=rem*powerOfNumber(base,power);
			        	result=result*rem;
			        	power=power+1;
			        	binary=binary/10;
			        			
			        }
			        System.out.println(result);
		}

			private void powerOfNumber(int base, int power) {
					int result=1;
					while(power>0) {
						result=result*base;
						power=power-1;
					}
					System.out.println(result);
		}

			private void spyNumber() {
					int no=132;
					int copy=no;
					int sum=0;
					int multiple=1;
					while(0<no) {
						int rem=no%10;
						sum=sum+rem;
						multiple=multiple*rem;
						no=no/10;
					}
					if(sum==multiple) {
						System.out.println(copy+ " Spy Number");
					}
					else {
						System.out.println(copy+ " Not Spy Number");
					}
		}

			private void perfectNumber() {
					int no=6;
					int div=1;
					int sum=0;
					while(div<no) {
						if(no%div==0) {
							sum=sum+div;
						}
						div=div+1;
					}
					if(no==sum) {
						System.out.println(no+ " Perfect Number");
					}
					else {
						System.err.println(no+ " Not Perfect Number");
					}
			}

			private void samePowerOfNumber() {
					int no=1;
					while(no<5) {
						int count=0;
						int result=5;
						while(count<no) {
							result=result*no;
							count=count+1;
						}
						System.out.println(result);
						no=no+1;
					}
		}

			private void greatestDivisor() {
                    int no=49;
                    int div=no/2;
                    while(div>=2) {
                    	if(no%div==0) {
                    		System.out.println(div);
                    		break;
                    	}
                    	div=div+1;
                    }
                 
		}

			private void smallestDivisor() {
					int no=49;
					int div=2;
					while(div<=no) {
						if(no/div==div) {
							System.out.println(div);
							break;
					}
				    	div=div+1;
				}
		}

			private void findSquareRoot() {
					int no=49;
					int div=2;
					while(div<=no) {                //while(div<=number/2)
						if(no/div==div) {
							System.out.println(div);
						}
						div=div+1;
					}
						
		}

			private void find_First_N_PrimeNo() {
					int no=2;
					int primecount=0;
			
					while(primecount < 10) {
						int div=2;
						int count=0;
				
						while(div<no) {
							if(no % div==0) {
								count=count+1;
								break;
					}
					div=div+1;
				}
				if(count==0) {
					System.out.println(div+ " ");
					primecount=primecount+1;
				}
				no=no+1;
			}
		}


			private void strongNo() {
					int no=145;
					int original=no;
					int fact=0;
					while(0<no) {
						int rem=no%10;
						fact=fact+rem;
						//fact=fact+factorial(rem);//call factorial method
							no=no/10;
					}
					if(original==no) {
						System.out.println(original+ " Strong No");
					}
					else {
						System.out.println(original+ " Not Strong No");
					}
		}


			private void neonNumber() {
					int no=9;
					int square=no*no;
					int sum=0;
					while(0<square) {
						int rem=square%10;
						sum=sum+rem;
						square=square/10;
					}
					if(no==sum) {
						System.out.println(no+ " Neon Number");
					}
					else {
						System.out.println(no+ "Not Neon Number");
					}
		}

			private void amstrongNo() {
					int no=153;
					int original=no;
					int sum=0;
					while(0<no) {
						int rem=no%10;
						sum=sum+(rem*rem*rem);
						no=no/10;
					}
					if(original==0) {
						System.out.println(original+" Amstrong No");
					}
					else {
						System.out.println(original+" Not Amstrong No");
					}
		}

			private void powerOfSquare() {
					int start=1;
					int end=10;
					while(start<=end){
						int result=start*start;
						System.out.println(result + " ");
						start=start+1;
					}
		}

			private void powerOfCube() {
                 	int no=1;
                 	int end=4;
                 	while(no<=end) {
                 		int sum=no*no*no;
                 		System.out.println(sum);
                 		no=no+1;
                 	}
		}
			private void multiple11() {

					int no=1;
					int multiple=11;
					while(no<=121) {
						System.out.println(no);
						no=no*multiple;
					}
						
		}

			private void multiple1To10() {
					int start=1;
					int end=10;
					while(start<=4) {
						int result=start*end;
						System.out.println(result);
						start=start+1;
						end=end-1;
					}
			
		}

			private void allFactorials() {
					int fact=5;
					while(0<fact) {
						System.out.println(fact);
						//System.out.println(factorial(fact));//call factorial method
						fact=fact-1;
					}		
		}

			private void factorial(int fact) {    //int method -->return declatred
				//int fact=10;
					int count=1;
					while(0<fact) {
						count=count*fact;
						fact=fact-1;
					}
					System.out.println(count);
					//return count;
		}

			private void palindrome() {
					int no=7887;
					int original=no;
					int rev=no;
					while(0<no) {
						int rem=no%10;
						rev=(rev+10)+rem;
						no=no/10;
					}
					if(original==rev) {
						System.out.println(original + " Palindrome");
					}
					else {
						System.out.println(original + " Not Palindrome");
					}
		}
		private void reverseInteger() {
				int no=78966;
				int rev=0;
				while(0<no) {
					int rem=no%10;
					rev=(rev*10)+10;
					no=no/10;
				}
				System.out.println(rev);
		}
		private void greatestCommonDivisor() {
				int no1=100;
				int no2=120;
				int div=2;
				int count=0;
				int small=no1<no2 ? no1:no2;
				while(div<=small) {
					if(no1%div==0 && no2%div==0) {
						System.out.println(div);
						count=div;
					}
					div=div+1;
				}
				  System.out.println(count);
				
		}
		
		private void commonDivisor() {
				int no1=100;
				int no2=120;
				int div=2;
				int small=no1<no2 ? no1:no2;
				while(div<=small) {
					if(no1%div==0 && no2%div==0) {
						System.out.println(div);
					}
						div=div+1;
				}
					System.out.println();
				
		}
		private void sum_of_digits(int box) {
				int count = 0; 
				int sum = 0; 
				while(box>0)
				{
					int rem = box%10; 
					sum = sum + rem;
					count = count+1; 
					box = box/10; 	
				}
				System.out.println("No  of Digits is "+ count);
				System.out.println("Sum of digits is "+ sum);
			
		}
		
				private void count_of_digits(int box) {
						int count=0;
						while(box>0) {
							System.out.print(box%10);
							count=count+1;
							box=box/10;
						}
						  System.out.println(" No of Digits is:" +count);
		}
				private void sumOfReverseNumber() {
			
						int no=87975;
						int sum=0;
						while(0<no) {
							int rem=no%10;
							sum=sum+rem;
							no=no/10;
						}
						  System.out.println(sum);
		}
				private void noOfReverseNumber() {
						int no=5678892;
						int count=0;
						while(0<no) {
							int rem=no%10;
							count=count+1;
							no=no/10;
						}
						  System.out.println(count);
		}
				private void reverseOrder(int box) {
			
						while(box>0) {
							System.out.print(box%10);
							box=box/10;
						}
						  System.out.println();
		}
				private void primeOrNot(int no) {
		    
						int div=2;
						int count=0;
						while(div<no) {
							if(no%div==0) {
								// System.out.print(div + " ");
								count=count+1;
							}	
							div=div+1;
						}
						if(count==0) {
							System.out.println("Prime Number");
						}
						else 
						{
							System.out.println("Not Prime Number");
						}
			 
		}
				private void count_of_divisors(int no) {
						int div=2;
						int count=0;
						while(div<no) {
							if(no%div==0) {
								System.out.print(div + " ");
								count=count+1;
							}
							div=div+1;
						}
						  System.out.println(count);
				}
				private void find_divisors(int no) {
						int div=2;
						while(div<no) {
							if(no%div==0) {
								System.out.print(div + " ");
							}
							div=div+1;
						}
						System.out.println();
					
				}
				private void sum_of_first_n_numbers() {
						int sum=0;
						int no=1;
						while(no<=10) {
							sum=sum+no;
							no=no+1;
						}
						System.out.println(sum);
				}
				private void multiples3OR5() {
						int no=3;
						while(no<=30) 
						{
							if(no%3==0 || no%5==0){
								System.out.print(no + " ");
							}
							no=no+1;
						}
						System.out.println();
				}
				private void multiples3AND5() {
					    int no=3;
					    while(no<=30) 
					    {
					    	if(no%3==0 && no%5==0) {
					    		System.out.print(no + " ");
					    		}
							no=no+1;

					    	 }
					       System.out.println();
					}
				private void print12345() {
						int start=1;
						int end=6;
						while(start<end) {
							System.out.print(start + " ");
							start=start+1;
						}
						System.out.println();
						
					}
				 private void printOne() {
						
						int start=1;
						int end=6;
						while(start<end) {
							System.out.print(1 + " ");
							start=start+1;
							}
					   System.out.println();
					}
	}
