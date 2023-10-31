package p2;
import p1.*;
import java.util.*;
public class DemoInheritance {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 B ob=new B();
	 System.out.println("enter the a value");
	 ob.a=s.nextInt();
	 System.out.println("enter the b value");
	 B.b =s.nextInt();
	 System.out.println("enter the x value");
	 ob.x=s.nextInt();
	 System.out.println("enter the y value");
	 B.y=s.nextInt();
	 ob.m1();
	 B.m2();
	 ob.m3();
	 B.m4();

	}

}
