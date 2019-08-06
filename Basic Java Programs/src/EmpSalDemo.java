import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EmpSalDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int bsal;
		double ta,da,hra,tax,pf, netsalary=0;
		char ch;
		
		
		Scanner sc=new Scanner(System.in);
		
		
		
	
	 do 
	 {
		 System.out.println("do you want employee salary Details: (y/n)");
         
		 ch=sc.next().charAt(0);
		 
		  switch(ch)
		  {
		  
		  case 'y':
		  case 'Y':
		  {
			  System.out.println("--------------------------------------------------");
			  System.out.println("Enter the Basic Salary::");
		  
	 
		    bsal=sc.nextInt();
		
	
		  if(bsal <= 10000)
		    {
			 ta=bsal*8/100;
			 da=bsal*12/100;
			 hra=bsal*15/100;
			 tax=bsal*2/100;
			 pf=bsal*5/100;
			 
		   }
		 else if(bsal > 10000 && bsal <= 20000)
		 {
			 ta=bsal*6/100;
			 da=bsal*10/100;
			 hra=bsal*12/100;
			 tax=bsal*3/100;
			 pf=bsal*4/100;
		 }
		 else if(bsal > 20000 && bsal <= 30000)
		 {
			 ta=bsal*4/100;
			 da=bsal*4/100;
			 hra=bsal*4/100;
			 tax=bsal*10/100;
			 pf=bsal*3/100;
		 }
		 else
		 {
			 ta=bsal*3/100;
			 da=bsal*3/100;
			 hra=bsal*3/100;
			 tax=bsal*15/100;
			 pf=bsal*3/100;
		 }
       
		  netsalary= bsal+ta+da+hra-tax-pf;
		  System.out.println("--------------------------------------------------");
		  System.out.println("Following are the Details of Employee Salary:");
		  System.out.println("--------------------------------------------------");
         System.out.println("Basic Salary="+ bsal);
         TimeUnit.SECONDS.sleep(3);
         System.out.println("Trav. Allowa="+ ta);
         TimeUnit.SECONDS.sleep(3);
         System.out.println("Daily Allowa="+ da);
         TimeUnit.SECONDS.sleep(3);
         System.out.println("HRA Allowanc="+ hra);
         TimeUnit.SECONDS.sleep(3);
         System.out.println("Payable Tax ="+ tax);
         TimeUnit.SECONDS.sleep(3);
         System.out.println("Provi. Fund ="+ pf);
         TimeUnit.SECONDS.sleep(3);
         System.out.println("Take Home Salary="+ netsalary);
         System.out.println("--------------------------------------------------");
          break;
		  } 
		  case 'n':
		  case 'N': break;
		  default: break;
	   }
	 }while(ch=='y');
	}

}
