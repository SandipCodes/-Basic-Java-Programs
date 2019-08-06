import java.util.Scanner;

public class Add
{
	int a,b,c;
	Scanner in=new Scanner(System.in);
	
	Add()
	{
		System.out.println("Enter Value of A:: ");
		a=in.nextInt();
		System.out.println("Enter Value of B:: ");
		b=in.nextInt();
		
				
		c=a+b;
		System.out.println("Addition is :: "+ c);
		
		

	}

}
