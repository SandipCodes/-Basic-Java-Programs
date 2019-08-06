import java.util.Scanner;

public class Mul 
{
	int a,b,c;
	Scanner in=new Scanner(System.in);
	
	Mul()
	{
		System.out.println("Enter Value of A:: ");
		a=in.nextInt();
		System.out.println("Enter Value of B:: ");
		b=in.nextInt();
		
				
		c=a*b;
		System.out.println("Multiplication is :: "+ c);
		
		//in.close();
	}
	

}
