package p1;

public class Subclass1 {
	public int a=10;
	public static int b=20;
	public void m1()
	{
		System.out.println("outer class");
		System.out.println("a value"+a );
		System.out.println("b value"+b);
	}
public static class Subclass2
{
	public int x=100;
	public static int y=200;
	public void m2()
	{
		System.out.println("inner class m2");
		//System.out.println("a value"+a);
		System.out.println("b value"+b);
		System.out.println("x value"+x);
		System.out.println("y vlaue"+y);
	}
	public static void m22()
	{
	System.out.println("static inner class m22");
	//System.out.println("a value"+a);
	System.out.println("b value"+b);
	//System.out.println("x value"+x);
	System.out.println("y value"+y);
	}
}
public static void main (String args[]) {
	Subclass1 ob=new Subclass1();
	ob.m1();
	Subclass1.Subclass2 ob2=new Subclass1.Subclass2();
	ob2.m2();
	Subclass2.m22();
}
}
