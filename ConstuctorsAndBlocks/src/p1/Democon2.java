package p1;
import java.util.Scanner;
class Disp{
	int x,y;
	Disp(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void dis()
	{
		System.out.println("**method**");
		System.out.println("value x:"+x);
		System.out.println("value y:"+y);
	}
}
public class Democon2 {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value v1:");
		int v1=s.nextInt();
		System.out.println("Enter the value v2:");
		int v2=s.nextInt();
		Disp ob =new Disp(v1,v2);//con call
			ob.dis();
			ob.dis();//method call
	}

}
