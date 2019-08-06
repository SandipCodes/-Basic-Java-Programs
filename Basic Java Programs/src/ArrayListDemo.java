
import java.util.*;

class ArrayListDemo 
{
	public static void main(String[] args) 
	{
		ArrayList a= new ArrayList();
		ArrayList a2=new ArrayList();
		
		a.add("A");
		a.add(10);
		a.add(10);
		a.add("A");
		a.add(null);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2, "k");
		System.out.println(a);
		a.add("n");
		System.out.println(a);
		
		
		a2.add("pp");
		a2.addAll(a);
		System.out.println(a2);
		
		System.out.println(a2.get(3));
		a2.set(2, "h");
		System.out.println(a2);
		
		System.out.println(a2.indexOf("A"));
		System.out.println(a2.lastIndexOf("A"));
				
	}//main()
}//class
