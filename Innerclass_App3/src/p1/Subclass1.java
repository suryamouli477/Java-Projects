package p1;

public class Subclass1 {
	public int a;
	public static int b;
	public Subclass1(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void m1()
	{
		System.out.println("outer class m1()");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
public static class Subclass2{
	public int x;
	public static int y;
	public Subclass2(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public void m2()
	{
		System.out.println("inner class m2()");
		System.out.println("x"+x);
		System.out.println("x"+y);
		//System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	public static void m22()
	{
		System.out.println("inner class m2()");
		//System.out.println("x"+x);
		System.out.println("x"+y);
		//System.out.println("a:"+a);
		System.out.println("b:"+b);
		
	}
}
}
