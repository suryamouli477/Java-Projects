package p2;
import p1.*;
import java.util.Scanner;
public class DemoBlock {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter a value:");
		Cclass  ob=new Cclass();
		ob.a =s.nextInt();
		System.out.println("main");
		System.out.println(ob.a);

	}

}
