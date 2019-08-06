import java.util.Scanner;

public class Div
{
	int a,b;
	float c;
	Scanner in=new Scanner(System.in);
	
	Div()
	{
		System.out.println("Enter Value of A:: ");
		a=in.nextInt();
		System.out.println("Enter Value of B:: ");
		b=in.nextInt();
		
				
		c=a/b;
		System.out.println("Divition is :: "+ c);
		
		//
		
	}


}
