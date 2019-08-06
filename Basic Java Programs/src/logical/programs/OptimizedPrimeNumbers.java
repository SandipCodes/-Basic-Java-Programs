/*
 * Java Program to check whether no is prime or not.
 * This program accepts input from command promt and checks whether no is prime or not
 *  
 */
package logical.programs;

import java.util.Scanner;

public class OptimizedPrimeNumbers {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int number=Integer.MAX_VALUE;
		
		System.out.println("Enter the no to check whether its prime or not:");
		while(number !=0) {
			number=sc.nextInt();
			
           System.out.printf("Does %d is prime? %s %s  %s %n", number,
                    isPrime(number), isPrimeOrNot(number), isPrimeNumber(number));

		}//while
		
	}//main
	
	public static boolean isPrime(int number) {
		
		int sqrt=(int) Math.sqrt(number)+1;
		
		for(int i=2;i<sqrt;i++) {
			
			if(number % i ==0) {
				//no is perfectly divisible --not prime 
				return false;
			}//if
		}//for
		return true;
	}
	public static boolean isPrimeOrNot(int number) {
	
		if(number ==2 || number==3) {
			return true;
		}
		if(number % 2==0) {
			return false;
		}
		
		int sqrt=(int)(Math.sqrt(number)+1);
		
		for(int i=3;i<sqrt;i+=2) {
			
			 if(number % i==0) {
				 return false;
			 }//if
		}//for
		return true;
	}//isPrimeNumber()


//first 2 aprroaches are very perfect 
	public static String isPrimeNumber(int number) {

		if(number <0) {
			return "not valid ";
		}
		if(number==0 || number ==1) {
			return "not prime";
		}
		if(number==2 || number==3) {
			return "prime ";
		}
		
		if((number * number-1) % 24==0 ) {
			return"prime ";
		}
		else {
			return "not prime";
		}
		
	}

}//class