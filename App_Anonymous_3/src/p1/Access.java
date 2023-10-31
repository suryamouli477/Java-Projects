package p1;

public class Access {
	public static Itest getRef()
	{
		Itest ob=new Itest ()
				{
			public void m1(int a)
			{
				System.out.println("Anonymous m1(a)");
				System.out.println("a:"+a);
			}
			
				};
				return ob;
	}

}
