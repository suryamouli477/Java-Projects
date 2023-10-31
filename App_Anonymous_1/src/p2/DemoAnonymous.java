package p2;
import p1.*;
public class DemoAnonymous {

	public static void main(String[] args) {
		Pclass ob=new Pclass()
	 {
			public void m1(int x)//overriding
			{
				System.out.println("Anonymous");
				System.out.println("x"+x);
			}
			public void m3(int z)//non overriding
			{
				System.out.println("Anonymous");
				System.out.println("z"+z);
			}			
			
	};
	ob.m1(11);
	ob.m2(12);
	//ob.m3(14);

	}

}
