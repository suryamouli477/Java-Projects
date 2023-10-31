package p1;

public class Subclass1 {
public int a=10;
public static int b=20;
public void m1()
{
	System.out.println("outer class");
	System.out.println("the value a:"+a);
	System.out.println("the value b:"+b);
}//outer method

public static class Subclass2
{
	int x=100;
	static int y=200;
	public void m2()
	{
		System.out.println("inner method m2()");
		System.out.println("the value x:"+x);
		System.out.println("the value y:"+y);
		//System.out.println("the value a:"+a);
		System.out.println("the value b:"+b);
	}
	public static void m22()
	{
		System.out.println(" static inner method m22()");
		//System.out.println("the value x:"+x);
		System.out.println("the value y:"+y);
		//System.out.println("the value a:"+a);
		System.out.println("the value b:"+b); 
	}
}
}
