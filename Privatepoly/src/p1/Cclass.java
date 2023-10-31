package p1;
public class Cclass {
private int a=10;
private static int b=15;
private void m1(int x)
{
	System.out.println("private Non-static m1(x)");
	System.out.println("value x is:"+x);
	}
private static  void m2(int y) 
{
 System.out.println("private static m2(y)");
 System.out.println("value y is:"+y);
}
public void dis()
{
	System.out.println("public dis()");
	//Cclass ob=new Cclass();
	//ob.m1(12);
	this.m1(13);
	Cclass.m2(11);
	System.out.println("value a is:"+a);
	System.out.println("value b is:"+b);
	}
}
