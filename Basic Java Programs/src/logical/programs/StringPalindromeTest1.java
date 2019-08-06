package logical.programs;

import java.util.Scanner;

public class StringPalindromeTest1 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String input=sc.nextLine();
	
	System.out.printf("Is %s a palindrome? : %b %n", input, isPalindrome(input));
    
	
	System.out.println("Enter another String:");
	input=sc.nextLine();
	
	System.out.printf("Is %s a palindrome? : %b %n", input, isPalindrome(input));
    
		
	}//main
	
	public static boolean isPalindrome(String input) {
		
		if(input==null || input.isEmpty()) {
			return true;
		}
		
		char array[]=input.toCharArray();
		StringBuffer sb=new StringBuffer(input.length());
		
		for(int i=input.length()-1;i>=0;i--) {
			sb.append(array[i]);
		}
		
		String reverseStr=sb.toString();
		
		/*if(input.equals(reverseStr)) {
			return true;
		}
		else {
			return false;
		}*/
		
		return input.equals(reverseStr);
	}//isPalindrome()

}//class
