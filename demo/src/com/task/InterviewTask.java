package com.task;

public class InterviewTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewTask it=new InterviewTask();
		it.merageArray();

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
