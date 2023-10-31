package p1;
public class Dclass extends Cclass {
	private void m3(int f)
	{
		System.out.println("Dclass private m3(f)");
		System.out.println("value f is:"+f);
	}
	private void m3(int f,int g)
	{
		System.out.println("Dclass private m3(f,g)");
		System.out.println("value f is:"+f);
		System.out.println("value g is:"+g);
		
	}
	public void display()
	{
		System.out.println("Dclass display merthod");
		//Dclass ob3=new Dclass();
		//ob3.m3(23);
		//ob3.m3(33,45);
		this.m3(88);
		this.m3(99,29);
	}

}
