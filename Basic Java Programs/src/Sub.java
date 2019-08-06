import java.util.Scanner;

public class Sub
{
 
	int a,b,c;
	Scanner in=new Scanner(System.in);
	
	Sub()
	{
		System.out.println("Enter Value of A:: ");
		a=in.nextInt();
		System.out.println("Enter Value of B:: ");
		b=in.nextInt();
		
				
		c=a-b;
		System.out.println("Substraction is :: "+ c);
		
		//in.close();

	}

}
