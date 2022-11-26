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
		  at.addTwoArray_A();
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