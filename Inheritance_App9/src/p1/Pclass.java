package p1;

public class Pclass {
	public Pclass(int a)
	{
		System.out.println("**pclass(a)**");
		System.out.println("a:"+a);
	}
public Pclass(int a,int b)
{   this(a);
	System.out.println("**pclass(a,b)**");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
}
}
