package p1;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the n number");
int i, count;
int n=s.nextInt();
for( i=0;i<=n;i++)
{    
	count=0;
	for(int j=1;j<=i;j++)
	{  
		
		
		if (i%j==0 && n%i==0)
		{
			count++;
			
		}
	}
		if (count==2)
		{
			System.out.println(i+" prime ");
		}
		//else 
			//System.out.println(i+" notprime ");
	}
	
}

	}

	
