package p1;
import java.util.*;
public class Con1 {
	int a;
	int b;
	String c;
public void Con1(int a,int b,String c) 
{
	this.a=a;
	this.b=b;
	this.c=c;
}
	void dis() {
	System.out.println("value a is:"+a);
	System.out.println("value b is:"+b);
	System.out.println("string is:"+c);
}
public static void main(String[]args) 
{
	
      Scanner s=new Scanner(System.in);
      Con1 ob=new Con1();
      System.out.println("enter a value");
      ob.a=Integer.parseInt(s.nextLine());
      System.out.println("enter b value");
      ob.b=Integer.parseInt( s.nextLine());
      System.out.println("enter string");
      ob.c=s.nextLine();
      ob.dis();
      
      s.close();
}

}
