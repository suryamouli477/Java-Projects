package p2;
import p1.*;
import java.util.Scanner;
public class DemoStaticVariable {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the a value:");
		Cclass.a=s.nextInt();
		System.out.println("the a values:"+Cclass.a);
		
	}

}
