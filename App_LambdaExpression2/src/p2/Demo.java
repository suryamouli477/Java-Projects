package p2;
import p1.*;
public class Demo {
	public static int b=10;
	public int c=14;

	public static void main(String[] args) {
		int d=40;
		Idisplay ob=(int k)->
		{
			System.out.println("k:"+k);
			//System.out.println("a:"+a);
			System.out.println("b:"+b);
		//	System.out.println("c:"+c);
			System.out.println("d:"+d);
			
		};
		
ob.m1(12);
	}

}
