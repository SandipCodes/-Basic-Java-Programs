/*
 * Program to Print Prime numbers between given range
 * @Sandip
 * 
 */
package logical.programs;

import java.util.Scanner;

public class PrimeNumberTest {

	public static void main(String[] args) {
		
		int number=1;
		boolean flag=false;
		
		Scanner sc=null;
		
		sc=new Scanner(System.in);
		
		System.out.println("ENter The No:");
		number=sc.nextInt();
	
		for(int i=2;i<=number-1;i++) {
			
			if(number % i ==0) {
		        flag=true;		
				break;
			}//if
		}//for
		
		if(flag==true) {
			System.out.println(number  + "  is not a prime no.");
		}
		else {
			System.out.println(number + "  is  a prime no.");
		}
	}//main

}//class
