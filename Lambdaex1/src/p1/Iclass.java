package p1;

public class Iclass {
	public static void main(String args[])
	{
		ITest ob=(int x)->
		{
		System.out.println("implemented ");
		System.out.println("value x is:"+x);
		};
		ob.m1(22);
		ob.m2(11, 22);
	}
	

}
