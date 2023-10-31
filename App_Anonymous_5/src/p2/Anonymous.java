package p2;
import p1.*;
import java.util.*;
public class Anonymous {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value v1");
		int v1=s.nextInt();
		System.out.println("Enter value v2");
		int v2=s.nextInt();
		System.out.println("Enter value choice");
		int choice =s.nextInt();
		switch(choice)
		{
		case 1:
			Itest ob=new Itest()
			{

				@Override
				public int  caluculate(int a, int b) {
					 if(a>0 && b>0) return a+b;
					 else return 0;
					 
					
				}
		
		
			};
			int res=ob.caluculate(v1, v2);
			System.out.println(res);
		case 2:
			Itest ob1=new Itest()
			{
				public int caluculate(int a,int b)
				{
					if(a>0 && b>0) return a-b;
					else return 0;
				}
				
			};
			int res1=ob1.caluculate(v1,v2);
			System.out.println(res1);
		case 3:
			Itest ob3=new Itest()
			{
				public int caluculate(int a,int b)
				{
					if(a>0 && b>0) return a*b;
					else return 0;
				}

				 
				
			};
			int res3=ob3.caluculate(v1, v2);
			System.out.println(res3);
		}
		
		
		
		
				
				
	}

}
