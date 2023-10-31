package p1;

public class Pclass {
	public static Pclass ob;
	private Pclass(){}
	public static Pclass getref()
	{
	 if(ob==null)
	 {
	  ob=new Pclass();
	 }
	 return ob;
	}	

public void m1(int a) {
	System.out.println("lazy method m1()");
	System.out.println("a value:"+a);
}

public static void main(String args[])
{
	Pclass ob=Pclass.getref();
	ob.m1(22);
}
}

	
