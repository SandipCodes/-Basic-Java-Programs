package logical.programs;

public class StringPalindromeTest2 {

	public static void main(String[] args) {

		System.out.println("Is nitin palindrom?: " + isPalindromString("nitin"));
		System.out.println("Is sachin palindrom?: " + isPalindromString("sachin"));

		System.out.println("Is bbbb palindrom?: " + isPalindromString("bbbb"));
		System.out.println("Is defg palindrom?: " + isPalindromString("defg"));

	}//main

	public static boolean isPalindromString(String str) {
		
		String reverseStr=reverse(str);
		
		if(str.equals(reverseStr)) {
			return true;
		}
		return false;
	}
	public static String reverse(String str) {
		
		if(str==null || str.isEmpty()) {
			return str;	
		}
		//need to think on it again.
		return str.charAt(str.length()-1) + reverse(str.substring(0, str.length() - 1));
		
	}//reverse()
}//class
