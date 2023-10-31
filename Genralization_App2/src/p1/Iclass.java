package p1;

public class Iclass implements Itest1 {
	public void m1(int a) //over and implemented method
	{
		System.out.println("Iclass m1(a)");
		System.out.println("the value a:"+a);
	}
public void m3(int c)//non overriding and non-implemented method
{
	System.out.println("Iclass m3(c)");
	System.out.println("the value c:"+c);
}
}
