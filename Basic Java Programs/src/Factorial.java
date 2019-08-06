import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
      Scanner in=new Scanner(System.in);
      
      int num,temp, fact=1;
      
      System.out.println("Enter the Number::");
      num=in.nextInt();
      
      temp=num;
      
      while(temp >=1)
      {
    	  fact=fact *temp;
    	  temp--;
      }
      
      System.out.println("Factorial of  " + num + "  is ::"+ fact);
      
    
      
	}

}
