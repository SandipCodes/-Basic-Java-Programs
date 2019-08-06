import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		int choice;
		
		Scanner in=new Scanner(System.in);
		
		do
		{
			System.out.println("------Menu-----------");
			System.out.println("1. ADDITION");
			System.out.println("2. SUBSTRACTION");
			System.out.println("3. MULTIPLICATION");
			System.out.println("4. DIVITION");
			System.out.println("ENTER YOUR CHOICE (Press 0 to stop Program:)");
			choice=in.nextInt();
			
			  switch(choice)
			  {
			  case 0: break;
			  case 1: new Add();
			          break;
			  case 2: new Sub();
			          break;
			  case 3: new Mul();
	                  break;
			  case 4: new Div();
	                  break;
	  
	          
			  default:
				    System.out.println("OOPS!!!ENTER VALID OPTION(1-4) !!");
			  
			  }
			
			
		}while(choice != 0);
		
		in.close();

	}

}
