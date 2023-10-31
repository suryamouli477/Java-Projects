package p1;

import java.util.*;

public class DemoArray {
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		
				System.out.println("Enter the no.of integer");
				int n=s.nextInt();
				Integer a[]=new Integer[n];
				System.out.println("Enter "+n+"Integers:");
				for(int i=0;i<n;i++)
				{
					a[i]=new Integer(s.nextInt());
				}
				System.out.println("Display old for loop");
				for(int i=0;i<n;i++)
				{
					System.out.print(a[i]+" ");
				}
				System.out.println("Using extend for java 5");
				for(Integer k:a)
				{
					System.out.print(k+" ");
				}
			System.out.println("spl iterator<t> java 8");
			Spliterator<Integer> sp = Arrays.spliterator(a);
	         sp.forEachRemaining((k)->
			
			{
				System.out.print(k.toString()+" ");
			});
			
		
		
	}

}
