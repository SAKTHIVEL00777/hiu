package com.task;

public class InterviewTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewTask it=new InterviewTask();
		//it.merageArray();
		int[] c= {1, 3, 3, 5, 2, 4, 6, 6};
    	//it.ascending(c);
    	//it.decsending(c);
		//it.duplicate(c);
		it.binaryORNot();
	
	
  }
	
	private void binaryORNot() {
		// TODO Auto-generated method stub
		int a=1010;
		boolean check=true;
		while(a>0) {
			if(a%10>1) {
				check=false;
			}
			a=a/10;
		}
		if(check) {
			System.out.println("BINARY NO");
		}
		else {
			System.out.println("NOT BINARY NO");

		}
		
	}
	private void duplicate(int[] c) {
		// TODO Auto-generated method stub
		//int dup=0;
		for(int i=0;i<c.length;i++) {
			for(int k=i+1;k<c.length;k++) {
				if(c[i]==c[k]) {
					//dup++;
					System.out.println(c[k]);
					
					}
		    	}
	    	}
		
	}


	private void decsending(int[] c) {
		// TODO Auto-generated method stub
		System.out.println("before array");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		int temp=0;
		
		for(int i=0;i<c.length;i++) {
			for(int j=1;j<c.length;j++) {
			if(c[j-1]<c[j]) {
				temp=c[j-1];
				c[j-1]=c[j];
				c[j]=temp;
			}
		}
		}
		System.out.println();
		System.out.print("After array");
		System.out.println();

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
		System.out.println();
		System.out.print("After array");
		System.out.println();
		
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
				
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

		
	}
