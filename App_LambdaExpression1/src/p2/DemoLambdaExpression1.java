package p2;
import p1.*;
public class DemoLambdaExpression1 {

	public static void main(String[] args) {
		Itest ob=(int x)->
		{
		System.out.println("implemented m1(x)");
		System.out.println("x:"+x);
		};
         ob.m1(12);
         ob.m2(13);
	}

}
