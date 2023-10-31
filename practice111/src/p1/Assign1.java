package p1;
import java.util.*;
public class Assign1 {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter a value:");
		int a=s.nextInt();
		System.out.println("enter b value:");
		
		int b=s.nextInt();
		int c=a-1;
		if(c==b)
		{
			System.out.println("-4");
		}
		else if(a<0)
		{
			System.out.println("-1");
		}
		else if(a==b)
		{
			System.out.println("-2");
		}
		else if(a<b)
		{
			System.out.println("-3");
		}
		else
		for(int i=c;i>b;i--)
		{
			System.out.print(i+" ");
		}
		 s.close();
	}

}
