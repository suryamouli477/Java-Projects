package p1;

public class Subclass1 {
int a=10;
static int b=20;
public void m1()
{
	System.out.println("outer class m1()");
	System.out.println("the value a:"+a);
	System.out.println("the value b:"+b);
}// outer class
public class Subclass2
{
	int x=100;
	static int y=200;
public void m2()
{
	System.out.println("instance inner class m2()");
	System.out.println("the value x:"+x);
	System.out.println("the value y:"+y);
	System.out.println("the value a:"+a);
	System.out.println("the value b:"+b);
	}
public static void m22()
{
	System.out.println("static inner class m22()");
	//System.out.println("the value x:"+x);
	System.out.println("the value y:"+y);
	//System.out.println("the value a:"+a);
	System.out.println("the value b:"+b);
	
}
}
}
