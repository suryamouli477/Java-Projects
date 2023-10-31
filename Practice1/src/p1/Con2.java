package p1;
import java.util.*;
public class Con2 {
	int a;
	int b;
public void con2(int a,int b)
{
	this.a=a;
	this.b=b;
	
}
void dis()
{
	System.out.println("a value"+a);
	System.out.println("b value"+b);
}
public static void main (String args[]) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the value v1");
	int a=s.nextInt();
	System.out.println("enter the value v2");
	int b=s.nextInt();
	Con2 ob=new Con2();
	ob.dis();
	System.out.println(ob);
}
}