package logical.programs;

import java.util.Scanner;

public class PrimeNumbersBetweenRange {

	public static void main(String[] args) {

		int upTo=1;
		boolean flag;
		
		Scanner sc=null;
		
		sc=new Scanner(System.in);
		
		System.out.println("ENter The No:");
		upTo=sc.nextInt();
	
		for(int i=3;i<=upTo;i++) {
			 flag=false;
			
			 for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					flag=true;
					break;
				}//if
			}//inner for
			
			if(flag==false) {
				System.out.print(i+"  ");
			}//if
			
		}//outer for

	}//main

}//class
