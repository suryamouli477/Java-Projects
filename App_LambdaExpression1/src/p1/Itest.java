package p1;

public interface Itest {
public abstract void m1(int x);
public default void m2(int y)
{
	System.out.println("default m2()");
	System.out.println("y:"+y);
}
}
 