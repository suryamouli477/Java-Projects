package p1;

public interface Itest {
	public abstract void m1 (int a);
	public default void m2(int b)
	{
		System.out.println("itest m2(b)");
		System.out.println("b:"+b);
	}

}
