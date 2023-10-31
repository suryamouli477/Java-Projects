package p1;
//import p2.*;
import java.util.*;
public class Sums
{
	public  static int  calucualate(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
			{							
			sum=sum+i;						 
			}
		}
	return sum;	
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n value:");
		 int n = s.nextInt();
		int v=Sums.calucualate(n);
		 
			System.out.println(v);		 
	}
}