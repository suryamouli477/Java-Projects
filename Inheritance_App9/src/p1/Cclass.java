package p1;

public class Cclass extends Pclass{
	public Cclass(int a,int b,int c)
	{   super(a,b);
		System.out.println("**cclass(a,b,c)**");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}

	public Cclass(int a,int b,int c,int d)
	{
		this(a,b,c);
		System.out.println("**cclass(a,b,c)**");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
	}

}
