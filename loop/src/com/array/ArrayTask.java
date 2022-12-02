package com.array;

import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		ArrayTask at=new ArrayTask();
		int[] ar= {10,20,30,50,70,90};
		  //at.printArray(ar);
		  //at.printIndex(ar);
		  //at.reverseArray(ar);
		  //at.linearSearch(50);
		  //at.liner(ar);
		  //at.oddIndex(ar);
		  //at.evenIndex(ar);
		  //at.getMark();
		  //at.getBiggest();
		  //at.getSmallest();
		  //at.lowestMark();
	      //at.secondBiggsetNo();
	      //at.secondSmallestNo();
		  //at.addOfOddIndex();
		  //at.copyArrayReverseOrder();
		  //at.negativeNoArray();
		  //at.countOfNegativeNo();
		  //at.copyNegativeNoArray();
		  //at.addTwoArray();
		  //at.addTwoArray_A();
		  //at.lastPlace();
		  //at.moveLeft(ar);
		  //at.twiceLeftMove();
		  //at.moveRight(ar);
		  //at.twiceRightMove();
		  //at.removeValueInArray();
		  //at.firstRepeatedElement();
		  //at.allRepeatedElement();
		  //at.allRepeatedChracter();
		  //at.mostRepeatedCharacter();
		  //at.nonRepeatedElement();
		  //at.findIndexAdd10();
		  //at.findIndexMultiple20();
		  //at.primeNo();
		  //at.perfectNo();
		  //at.factorial(5);
		  //at.printOddElementInEevenIndex();
		  //at.printEvenElementInOddIndex();
		  //at.splitOddAndEvenElement();
		  //at.divideNoSameArray();
		  at.printOnlyAdjacentValues();
	}
	private void printOnlyAdjacentValues() {
		// TODO Auto-generated method stub
		int[] ar = {16, 8, 15, 7,30}; 
		//			0  1   2  3
					//3<8
		for(int j = 0; j<ar.length-1; j++)
		{
		int small = ar[j]<ar[j+1]?ar[j]: ar[j+1];
		int big = ar[j]>ar[j+1]? ar[j]: ar[j+1]; 
		for(int i= small; i<=big; i++)
		System.out.print(i+" "); 
		System.out.println();
		}
		}

	private void divideNoSameArray() {
			int ar[]= {30,12,35,40,9};
			int div=0;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]%3==0) {
					div=ar[i]/3;
					ar[i]=div;
				}
				System.out.print(ar[i]+" ");
			}
	}
	private void splitOddAndEvenElement() {
			int ar[]= {10,20,23,25,27,28,15,18};
			int evenCount=0;
			int oddCount=0;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]%2==0) {
					evenCount++;
				}
				else {
					oddCount++;
				}
			}
			int even[]=new int[evenCount];
			int odd[]=new int[oddCount];
			int j=0;
			int k=0;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]%2==0) {
					even[j]=ar[i];
					j++;
				}
				else {
					odd[k]=ar[i];
					k++;
				}
			}
			System.out.print("even: ");
			for(int i=0;i<even.length;i++) {
				System.out.print(even[i]+" ");
			}
			System.out.println();
			System.out.print("odd: ");
			for(int i=0;i<odd.length;i++) {
				System.out.print(odd[i]+" ");
			}
	}
	private void printEvenElementInOddIndex() {
			int ar[]= {10,20,40,10,13,15,16,18};
			for(int i=0;i<ar.length;i++) {
				if(i%2!=0 && ar[i]%2==0) {
					System.out.print(ar[i]+" ");
				}
			}
	}
	private void printOddElementInEevenIndex() {
			int ar[]= {9,11,17,13,14,16,5};
			for(int i=0;i<ar.length;i++) {
				if(i%2==0 && ar[i]%2!=0) {
					System.out.print(ar[i]+" ");
				}
			}
	}
	private void factorial(int no) {    //int declare for 
			int fact=1;
			while(0<no) {
				fact=fact*no;
				no--;
			}
			System.out.println(fact);
			//return count;
	}
	private void perfectNo() {
			int ar[]= {6,7,45,28};
			for(int i=0;i<ar.length;i++) {
				int div=1;
				int sum=0;
				while(div<ar[i]) {
					if(ar[i]%div==0) {
						sum=sum+div;
					}
					div++;
				}
				if(ar[i]==sum) {
					System.out.println(ar[i]+" is perfect no");
				}
				else {
					System.out.println(ar[i]+" is not perfect no");
				}
			}
	}
	private void primeNo() {
			int ar[]= {3,5,6,7,8,11,12,13};
			for(int i=0;i<ar.length;i++) {
				int div=2;
				int count=0;
				while(div<ar[i]) {
					if(ar[i]%div==0) {
						count++;
					}
					div++;
					
					if(count==0) {
						System.out.println(ar[i]+" is prime no");
					}
					else {
						System.out.println(ar[i]+" is not prime no");
					}
				}
			}

	}
	private void findIndexMultiple20() {
			int ar[]= {1,20,5,3,5,6,4};
			for(int i=0;i<ar.length;i++) {
				int key=ar[i];
				for(int j=i+1;j<ar.length;j++) {
					if(key*ar[j]==20) {
						System.out.println(i+"  "+j);
					}
				}
			}
	}
	private void findIndexAdd10() {
			int ar[]= {0,10,5,3,5,6,7};
			for(int i=0;i<ar.length;i++) {
				int key=ar[i];
				for(int j=i+1;j<ar.length;j++) {
					if(key+ar[j]==10) {
						System.out.println(i+"  "+j);
					}
				}
			}
	}
	private void nonRepeatedElement() {
		String st="sakthi";
		char[] name=st.toCharArray();
		int[]freq=new int[name.length];
		for(int i=0;i<name.length;i++) {
			char key=name[i];
			int count=1;
			for(int j=i+1;j<name.length;j++) {
				if(key==name[j]) {
					freq[j]=-1;
					count++;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==1) {
				System.out.println(name[i]+" -is non repeated ");
			}
		}
	}
	private void mostRepeatedCharacter() {
		String st="kavinkumar";
		char[] name=st.toCharArray();
		int[]freq=new int[name.length];
		for(int i=0;i<name.length;i++) {
			char key=name[i];
			int count=1;
			for(int j=i+1;j<name.length;j++) {
				if(key==name[j]) {
					freq[j]=-1;
					count++;
				}
			}
			if(freq[i]!=-1) {
				freq[i]=count;
			}
		}
		char highest=0;
		int big=Integer.MIN_VALUE;
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>big) {
				big=freq[i];
				highest=name[i];
			}
		}
		System.out.println(highest+" is most repeated character"+big);
	}
	private void allRepeatedChracter() {
			String st="kavinkumar";
			char[] name=st.toCharArray();
			int[]freq=new int[name.length];
			for(int i=0;i<name.length;i++) {
				char key=name[i];
				int count=1;
				for(int j=i+1;j<name.length;j++) {
					if(key==name[j]) {
						freq[j]=-1;
						count++;
					}
				}
				if(freq[i]!=-1) {
					freq[i]=count;
				}
			}
			for(int i=0;i<freq.length;i++) {
				if(freq[i]>1) {
					System.out.println(name[i]+" times "+freq[i]+" repeate");
				}
			}

	}
	private void allRepeatedElement() {
			int[] no= {10,20,30,10,50,20,10,30};
			int[] repeatCount=new int[no.length];
			for(int i=0;i<no.length;i++) {
				int key=no[i];
				int count=1;
				for(int j=i+1;j<no.length;j++) {
					if(key==no[j]) {
						//System.out.println(no[j]);
						repeatCount[j]=-1;
						count++;
					}
				}
				if(repeatCount[i] !=-1) {
					repeatCount[i]=count;
					
				}
			}
			for(int i=0;i<repeatCount.length;i++) {
				if(repeatCount[i]>1)
					System.out.println(no[i]+" times "+repeatCount[i]+" repeate");
			}
	}
	private void firstRepeatedElement() {
			String st="kavinkumar";
			boolean repeat=false;
			char[] name=st.toCharArray();
			for(int i=0;i<name.length-1;i++) {
				char key=name[i];
				for(int j=i+1;j<name.length;j++) {
					if(key==name[j]) {
						System.out.println(name[j]);
						repeat=true;
						break;
					}
				}
				if(repeat==true) {
					break;
				}
			}
	}
	private void removeValueInArray() {
	      	int[] ar= {10,20,30,40,50,70,90};
	      	System.out.println("Print Value ");
	      	for(int i=0;i<ar.length;i++) {
	      		System.out.print(ar[i]+" ");
	      	}
	      	System.out.println();
	      	System.out.println("Remove Value");
	      	int key=40;
	      	int index=-1;
	      	for(int i=0;i<ar.length;i++) {
	      		if(ar[i]==key) {
	      			index=i;
	      			break;
	      		}
	      	}
	      	for(int i=index;i<ar.length-1;i++) {
	      		ar[i]=ar[i+1];
	      	}
	      	for(int i=0;i<ar.length;i++) {
	      		System.out.print(ar[i]+" ");
	      	}
	      	

	}
	private void twiceRightMove() {
		int ar[]= {10,20,30,47,55};
		for(int shift=1;shift<=2;shift++) {   //twice move from right
			int right[]=moveRight(ar);
			for(int i=0;i<right.length;i++) {
				System.out.print(right[i]+" ");
			}
		}
	}
	private int[] moveRight(int[] ar) {
		      //int[] ar= {10,20,30,50,70,90};
				System.out.println();
				System.out.print("Before Move");
				int temp=ar[ar.length-1];
				for(int i=0;i<ar.length;i++) {
					System.out.print(ar[i]+" ");
				}
				System.out.println();
				System.out.print("After Move");
				int i;
				for(i=ar.length-1;i>=1;i--) {
					ar[i]=ar[i-1];
					
				}
				ar[i]=temp;
				return ar;	
	}
	private void twiceLeftMove() {
			int ar[]= {10,20,30,47,55};
			for(int shift=1;shift<=2;shift++) {   //twice move from left
				int left[]=moveLeft(ar);
				for(int i=0;i<left.length;i++) {
					System.out.print(left[i]+" ");
				}
			}
	}
	private int[] moveLeft(int ar[]) {
		//int[] ar= {10,20,30,50,70,90};
		System.out.println();
		System.out.print("Before Move");
		int temp=ar[0];
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.print("After Move");
		int i;
		for(i=0;i<ar.length-1;i++) {
			ar[i]=ar[i+1];
			
		}
		ar[i]=temp;
		return ar;
		/*
		 * for(i=0;i<ar.length;i++) { System.out.print(ar[i]+" ");
		 * 
		 * }
		 */
   }
	private void lastPlace() {
			int ar[]= {10,20,30,50};
			int key=40;
			ar[ar.length-1]=key;
			for(int i=0;i<ar.length;i++) {
				System.out.print(ar[i]+" ");
			}
	}
	private void addTwoArray_A() {
		int a[]= {10,20,30};
		int b[]= {10,20,30,40,50,60,70};
		int small=a.length<b.length?a.length:b.length;
		int big=a.length>b.length?a.length:b.length;
		int c[]=new int[big];
		for(int i=0;i<small;i++) {
			c[i]=a[i]+b[i];
			System.out.print(c[i]+" ");
		}
		for(int i=0;i<c.length;i++) {
			c[i]=b[i];
			System.out.print(c[i]+" ");
		}
	}

	private void addTwoArray() {
			int a[]= {10,20,30};
			int b[]= {15,30,35};
			int c[]=new int[b.length];
			for(int i=0;i<b.length;i++) {
				c[i]=a[i]+b[i];
				System.out.print(c[i]+" ");
			}
	}
	private void copyNegativeNoArray() {
		int ar[]= {10,20,-5,-15,-25,30};
	    int neg[]=new int[ar.length];
		int j=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<0) {
				neg[j]=ar[i];
				System.out.print(neg[j]+" ");
				j++;
			}
		}

	}
	private void countOfNegativeNo() {
		int ar[]= {10,20,-5,-15,-25,30};
			int count=0;
			for(int i=0;i<ar.length;i++) {
				if(0>ar[i]) {
					count++;
				}
			}
			System.out.println("No Of Negative:"+count);
			//return count;
	}

	private void negativeNoArray() {
			int ar[]= {10,20,-5,-15,-25,30};
			for(int i=0;i<ar.length;i++) {
				if(0>ar[i]) {
					System.out.print(ar[i]+" ");
				}
			}
	}

	private void copyArrayReverseOrder() {
		int ar[]= {10,20,30,40,50};
		int rev[]=new int[ar.length];
		int j=ar.length-1;
		for(int i=0;i<ar.length;i++) {
			rev[i]=ar[j];
			System.out.print(rev[i]+" ");
			j--;
		}	
	}

	private void addOfOddIndex() {
			int[] ar= {10,20,30,40,50,60};
			int sum=0;
			for(int i=0;i<ar.length;i++) {
				if(i%2!=0) {
					sum+=ar[i];
				}
			}
			System.out.println(sum);
	}

	private void secondSmallestNo() {
			int[] ar= {5,10,15,20};
			int small1=Integer.MAX_VALUE;
			int small2=Integer.MAX_VALUE;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]<small1) {
					small2=small1;
					small1=ar[i];
				}
				else if(ar[i]<small2) {
					small2=ar[i];
				}
			}
			System.out.println("Smallest No Is: "+small1);
			System.out.println("Smallest No Is: "+small2);
	}

	private void secondBiggsetNo() {
			int[] ar= {15,12,14,18};
			int big1=Integer.MIN_VALUE;
			int big2=Integer.MIN_VALUE;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]>big1) {
					big2=big1;
					big1=ar[i];
				}
				else if(ar[i]>big2) {
					big2=ar[i];
					}
				}
			System.out.println("Biggest No Is: "+big1);
			System.out.println("Biggest No Is: "+big2);
	}

	private void lowestMark() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Subject");
		int sub=sc.nextInt();
		int mark[]=new int[sub];
		int low=Integer.MAX_VALUE;
		for(int i=0;i<mark.length;i++) {
			System.out.print("Enter Mark: ");
			mark[i]=sc.nextInt();
			if(mark[i]<low) {
				low=mark[i];
			}
		}
		System.out.println("Lowest Mark: "+low);
	}

	private void getSmallest() {
	    	Scanner sc=new Scanner(System.in);
			System.out.println("Enter No of Days");
			int day=sc.nextInt();
			int temp[]=new int[day];
			int small=Integer.MAX_VALUE;
			int big=Integer.MIN_VALUE;
			for(int i=0;i<temp.length;i++) {
				System.out.print("Enter temperature: ");
				temp[i]=sc.nextInt();
				if(temp[i]<small) {
					small=temp[i];
				}
				if(temp[i]>big) {
					big=temp[i];
				}
			}
			System.out.println("Lowest temperature: "+small);
			System.out.println("Highest temperature: "+big);
	}

	private void getBiggest() {
		Scanner sc=new Scanner(System.in);			
		System.out.println("Enter No of Subject");
		int sub=sc.nextInt();
		int mark[]=new int[sub];
		int big=0;
		for(int i=0;i<mark.length;i++) {
			System.out.print("Enter mark: ");
			mark[i]=sc.nextInt();
			if(mark[i]>big) {
				big=mark[i];
			}
		}
		System.out.println("Highest mark: "+big);
	}

	private void getMark() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter No of Subject");
			int sub=sc.nextInt();
			int mark[]=new int[sub];
			int total=0;
			for(int i=0;i<mark.length;i++) {
				System.out.print("Enter Mark: ");
				mark[i]=sc.nextInt();
				total+=mark[i];
			}
			System.out.println("Total: "+total);
			//System.out.println("Average "+total/mark.length);
	}

	private void evenIndex(int[] ar) {
			for(int i=0;i<ar.length;i+=2) {
				System.out.print(ar[i]+" ");
				System.out.println("index "+i);
			}
	}

	private void oddIndex(int[] ar) {
			for(int i=1;i<ar.length;i+=2) {
				System.out.print(ar[i]+" ");
				System.out.println("index "+i);
			}
	}

	private void liner(int[] ar) {
			int count=0;
			int key=30;
			for(int i=0;i<ar.length;i++) {
				if(ar[i]==key) {
					count++;
				}
			}
			System.out.println(count);
	
	}

	private void linearSearch( int key) {
			int ar[]= {10,20,30,50,70,90};
	         for(int i=0;i<ar.length;i++) {
				if(ar[i]==key) {
					System.out.println("Key Value: "+key);
					break;
				}
			}
	}

	private void reverseArray(int[] ar) {
			for(int i=ar.length-1;i>=0;i--) {
				System.out.print(ar[i]+" ");
			}
	}

	private void printIndex(int[] ar) {
			for(int i=0;i<ar.length;i++) {
				System.out.print(i+" ");
			}
	}


	private void printArray(int[] ar) {
			for(int i=0;i<ar.length;i++) {
				System.out.print(ar[i]+" ");
			}
	}

}
