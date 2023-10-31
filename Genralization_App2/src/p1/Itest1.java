package p1;

public interface Itest1 {
public abstract void m1(int a);
public default void m2(int b)
{
System.out.println("deafult m2(b)");
System.out.println("the value b:"+b);
}
}
