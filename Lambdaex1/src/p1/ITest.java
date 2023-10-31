package p1;

public interface ITest {
	public void m1(int x);
	public default void m2(int a, int b)
	{
		System.out.println("m2");
		System.out.println(a);
		System.out.println(b);
	}
}
 


