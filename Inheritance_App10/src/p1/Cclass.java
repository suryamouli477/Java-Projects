package p1;

public class Cclass extends Pclass {
	public void m2(int a,int b,int c)
	{
		super.m1(a, b);
		System.out.println("**m2(a,b,c)**");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
	}
public  void m2(int a,int b,int c,int d)
{   this.m2(a,b,c);	
	System.out.println("**m2(a,b)**");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("c:"+c);
	System.out.println("d:"+d);
}

}
