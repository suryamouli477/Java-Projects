package p2;
import p1.*;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
Scanner s = new Scanner(System.in);
System.out.println("enter v1:");
int v1=s.nextInt();
System.out.println("enter v2:");
int v2=s.nextInt();
System.out.println("enter your choice");
int choice =s.nextInt();

switch(choice)
{
case 1:
	Addition a= new Addition();
	float ad=a.calculate(v1, v2);
	System.out.println("addition:"+ ad);
	break;
case 2:
    Sub su=new Sub();
    float sb=su.calculate(v1, v2);
    System.out.println("sub"+ sb);
    break;
case 3:
	Mul m=new Mul();
	float ml=m.calculate(v1, v2);
	System.out.println("multi"+ ml);
	break;
case 4:
	Div d=new Div();
	float div=d.calculate(v1, v2);
	System.out.println("div"+div);
	break;
case 5:
	ModDiv md=new ModDiv();
	float mod=md.calculate(v1,v2);
	System.out.println("mod"+ mod);
	break;
	default:
		System.out.println("invalid input");
}
s.close();
	}

}
