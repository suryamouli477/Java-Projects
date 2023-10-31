package p2;
import p1.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter v1 value:");
int v1=s.nextInt();
System.out.println("enter v2 value:");
int v2=s.nextInt();

if(v1>0 && v2>0)
{
	System.out.println("***choice**");
	System.out.println("\t1.Greatervalue"+"\n\t2.Smaller value");
	System.err.println("Enter the choice:");
	int choice=s.nextInt();
	switch(choice)
	{
	case 1:
		Greatervalue gv=new Greatervalue();
		int res1=gv.comparedto(v1, v2);
		System.out.println("greater value"+res1);
		break;
	case 2:
		Smallervalue sm=new Smallervalue();
		int res2=sm.comparedto(v1, v2);
		System.out.println("smaller value"+res2);
		break;
		default:
			System.out.println("invalid input");
	}//end switch
}//end if
else
{
	System.out.println("invalid input");
}
	}

}
