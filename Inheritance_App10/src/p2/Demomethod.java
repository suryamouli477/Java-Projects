package p2;
import java.util.*;
import p1.*;
public class Demomethod {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the a value:");
	int a =s.nextInt();
	System.out.println("Enter the b value:");
	int b =s.nextInt();
	System.out.println("Enter the c value:");
	int c =s.nextInt();
	System.out.println("Enter the d value:");
	int d =s.nextInt();
	Cclass ob=new Cclass();
	ob.m1(a);
	ob.m1(a, b);
	ob.m2(a, b, c);
	ob.m2(a, b, c, d);
	}

}
	 