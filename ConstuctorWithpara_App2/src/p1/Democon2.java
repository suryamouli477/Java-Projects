
package p1;
import java.util.Scanner;
class Display{
	int x,y;
Display(int x,int y)
{
	this.x=x;
	this.y=y;
}
void dis()
{
	System.out.println("*method dis()*");
	System.out.println("the x value:"+x);
	System.out.println("the y value:"+y);
}
public class Democon2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the x value:");
	int v1=s.nextInt();
	System.out.println("Enter the y value:");
	int v2=s.nextInt();
	Display ob =new Display(v1,v2);
ob.dis();
ob.dis();
	s.close();


	}

}
}

