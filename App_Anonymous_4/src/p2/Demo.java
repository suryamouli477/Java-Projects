package p2;
import p1.*;
import java.util.*;
public class Demo {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value v1:");
	int v1= s.nextInt();
	System.out.println("Enter the value v2:");
	int v2= s.nextInt();
	if(v1>0 && v2>0)
	{
		System.out.println("****Choice****");
	System.out.println("\t1.GreaterValue"+"\n\t2.SmallerValue");
	System.out.println("Enter the Choice:");
	int choice = s.nextInt();
	switch (choice)
	{
	case 1:
		// greater anonymous
		Icomparable ob= new Icomparable()
		{


				@Override
				public int compare(int a, int b)
				{
					if(a>b) return a;
					else return b;
				}			
		};
		int res=ob.compare(v1, v2);
		System.out.println("greater value:"+res);
		break;
	case 2:
		//smaller anonymous
		Icomparable ob1= new Icomparable()
		{

			@Override
			public int compare(int a, int b) {
				if(a<b) return a;
				else return b;
			}			
		};
		int res1=ob1.compare(v1, v2);
		System.out.println("smaller value:"+res1);
		break;
		default:
			System.out.println("invalid input");
		
	}
	}
	else
	{
		System.out.println("invalid input");
	}
	}
}