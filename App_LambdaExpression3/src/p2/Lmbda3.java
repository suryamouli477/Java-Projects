package p2;
import p1.*;
import java.util.*;
public class Lmbda3 {
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		System.out.println("v1:");
		int v1=s.nextInt();
		System.out.println("v2");
		int v2=s.nextInt();
		if(v1>0 && v2>0)
		{
			System.out.println("choice");
			System.out.println("t1.greater value"+"\nt2.smaller value");
			System.out.println("enter choice");
			int choice=s.nextInt();
			Icomparable ob=A.getRef(choice);
			if(ob==null)
			{
				System.out.println("invalid");
			}
			else
			{
				System.out.println(ob.compareTo(v1, v2));
			}
		}
		else
		{
			System.out.println("invalid");
		}
		
	}

}
