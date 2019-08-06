package logical.programs;

import java.util.Scanner;

public class FibonassiCalculator {

	public static void main(String[] args) {
		
		int number=0;
		Scanner sc=null;
		
		sc=new Scanner(System.in);
		
		//enter the number upto which Series will be print
		System.out.println("ENter the Number till u want to Print Fibo Ser:");
        System.out.println("Fibo series using Recursion::");
		number=sc.nextInt();
		
		for(int i=1;i<=number;i++) {
			
		   System.out.print(fibonassi(i)+ " ");
			
		}//for
		
		System.out.println();
		System.out.println("Fibo series using Itration::");
		number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			
			   System.out.print(fibonassi2(i)+ " ");
				
			}//for
		
	}//main

	public static int fibonassi(int number) {
		
		if(number==1 || number==2) {
			return 1;
		}
		return fibonassi(number-1) + fibonassi(number-2);//tail recursion
	}
	
	public static int fibonassi2(int number) {
	
		if(number==1 || number==2) {
			return 1;
		}
		
		int  fibo1=1,fibo2=1,fibonas=1;
		 
		for(int i=3; i<= number; i++){
	           
	            //Fibonacci number is sum of previous two Fibonacci number
	            fibonas = fibo1 + fibo2;             
	            fibo1 = fibo2;
	            fibo2 = fibonas;
	            
	          
	        }//for
		return fibonas;
	}//method()
}//class
