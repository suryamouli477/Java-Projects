package p1;

public class Iclass implements Itest {
public void m1(int x)
{
System.out.println("implemented -m1");
System.out.println("x:"+x);
}

@Override
public void m2(int y)
{
System.out.println("implemented-m2");
System.out.println("y:"+y);
	
}
public void m3(int z)
{
	System.out.println("implemented-m3");
	System.out.println("z:"+z);	
}
}
