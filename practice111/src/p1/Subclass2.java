package p1;

public class Subclass2 {
	public int a=20;
	public static int b=30;
	void m1()
	{
		System.out.println("outer m1() ");
		System.out.println("a value:"+a);
		System.out.println("b value:"+b);
	}
	public class Subclass3{
	    int x=100;
		static int y=200;
		void m2()
		{
			System.out.println("inner class m2");
			System.out.println("a value :"+a);
			System.out.println("b value:"+b);
			System.out.println("x value:"+x);
			System.out.println("y value:"+y);
		}
		static  void m22()
		{
			System.out.println("inner static m22()");
			//System.out.println("a value:"+a);
			System.out.println("b value:"+b);
			//System.out.println("x value:"+x);
			System.out.println("y value:"+y);
		}
	}
	public static void main(String args[]) 
	{
		Subclass2 ob1 =new Subclass2();
		ob1.m1();
		Subclass2.Subclass3 ob2=ob1. new Subclass3();
		ob2.m2();
		Subclass2.Subclass3.m22();
		
		
	}

}
