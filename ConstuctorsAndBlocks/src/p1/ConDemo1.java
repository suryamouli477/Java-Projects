package p1;
import java.util.Scanner;
class Display
{
	int x,y;
	Display()
	{
		System.out.println("***constructor***");
		System.out.println("value x:"+x);
		System.out.println("value y:"+y);
	}
	void Display()
	{
		System.out.println("***method()***");
		System.out.println("value x:"+x);
		System.out.println("value y:"+y);
	}
}
public class ConDemo1 {
	public static void main(String args[]) {
		Scanner s =new Scanner(System.in);
		Display ob =new Display();//con call
		System.out.println("Enter the x value:");
		ob.x=s.nextInt();
		System.out.println("Enter the y value:");
		ob.y=s.nextInt();
		
		ob.Display();
		ob.Display();
		s.close();
	}

}
