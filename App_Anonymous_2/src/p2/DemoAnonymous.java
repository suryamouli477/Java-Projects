package p2;
import p1.*;
public class DemoAnonymous {

	public static void main(String[] args) {
		Itest ob=new Itest()
				{

					@Override
					public void m1(int x)
					{
					System.out.println("anonymous m1(x)");
					System.out.println("x:"+x);	
					}
					public void m3(int z)
					{
					System.out.println("anonymous m3(z)");
					System.out.println("z:"+z);	
					}
			
				};
				ob.m1(11);
				ob.m2(12);
				//ob.m3(13)

	}

}
