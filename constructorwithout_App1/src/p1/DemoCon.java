package p1;
import java.util.*;
class Display
{
	int x,y;
Display()
{
	System.out.println("*constructor-display*");
	System.out.println("the x value:"+x);
	System.out.println("the y value:"+y);
}
void dis()
{
	System.out.println("method-dis");
	System.out.println("the x value:"+x);
	System.out.println("the y value:"+y);
}
}

public class DemoCon {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Display ob =new Display();
    System.out.println("Enter the x value:");
    ob.x=s.nextInt();
    System.out.println("Enter the y vaue:");
    ob.y=s.nextInt();
    ob.dis();
    s.close();

	}

}
