package com.task;

public class InterviewTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewTask it=new InterviewTask();
		//it.merageArray();
		int[] c= {1, 3, 3, 5, 2, 4, 6, 6}; 
    	it.ascending(c);

  }

	private void merageArray() {
		// TODO Auto-generated method stub
		int a[]= {1,3,3,5};
		int b[]= {2,4,6,6};
		int merage=a.length+b.length;
        int c[]=new int[merage];
        int j=0;
        for(int i=0;i<a.length;i++) {
        	c[j]=a[i];
        	j++;
        }
        for(int i=0;i<b.length;i++) {
        	c[j]=b[i];
        	//c[a.length+i]=b[i];
        	j++;
	}
        for(int i=0;i<c.length;i++) {
        	System.out.print(c[i]+" ");
        }
	}

	private void ascending(int[] c) {
		// TODO Auto-generated method stub
		System.out.println("before array");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		int temp=0;
		
		for(int i=0;i<c.length;i++) {
			for(int j=1;j<c.length;j++) {
			if(c[j-1]>c[j]) {
				temp=c[j-1];
				c[j-1]=c[j];
				c[j]=temp;
			}
		}
		}
		System.out.print("After array");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
				
		}
		
	}

