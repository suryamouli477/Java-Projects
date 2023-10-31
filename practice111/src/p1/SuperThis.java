package p1;
 class  Test 
{
	String s="parent variable";
}
	 class C extends Test
	{
		String s="child variale";
	
		public void m1()
		{
			System.out.println(s);//child 
			System.out.println(this.s);//child
			System.out.println(super.s);//parent 
			
				
		}
		}
public	class SuperThis
{
	public static void main(String args[])
	{
		C ob =new C();
		ob.m1();
	}
}


