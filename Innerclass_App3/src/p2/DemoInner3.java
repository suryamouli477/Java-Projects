package p2;
import p1.*;
import java.util.*;
public class DemoInner3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the a value:");
        int a=s.nextInt();
        System.out.println("enter the b value:");
        int b=s.nextInt();
        System.out.println("enter the x value:");
        int x=s.nextInt();
        System.out.println("enter the y value:");
        int y=s.nextInt();
        Subclass1 ob1=new Subclass1(a,b);
        ob1.m1();
        Subclass1.Subclass2 ob2= new Subclass1.Subclass2(x,y);
        ob2.m2();
        Subclass1.Subclass2.m22();
        
	}

}
