package p2;
import p1.*;
import java.util.Scanner;
public class DemostaticBlock  {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the a value:");
		Cclass.a=s.nextInt();
		System.out.println("enter the b value:");
		Cclass.b=s.nextInt();
		System.out.println("main method");
		System.out.println("a value"+Cclass.a);
		System.out.println("b value"+Cclass.b);

	}

}
