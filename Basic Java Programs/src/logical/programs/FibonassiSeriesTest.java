package logical.programs;

import java.util.Scanner;

public class FibonassiSeriesTest {

	public static void main(String[] args) {
		
		int upTo=0,nextVal=0;
		Scanner sc=null;
		int values[];
		
		
		 sc=new Scanner(System.in);
	
		System.out.print("Print Fibo Series Upto:: ");
	    upTo=sc.nextInt();
	    
	    values=new int[upTo];
	    
	    values[0]=nextVal;
	    System.out.print(nextVal+" ");
		values[1]=++nextVal;
	    System.out.print(nextVal+" ");
		
	   int k=0;
	   
	   for(int i=2;i<upTo;i++) {
		   
		   nextVal=values[k]+values[k+1];
		   
		   values[i]=nextVal;
		   System.out.print(nextVal+" ");
		   k++;
		   
	   }//for
	}//main

}//class
