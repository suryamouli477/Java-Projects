package p1;
public class Cclass {
	 private static Cclass ob=null ;
	 private Cclass(){}
	 static
	 {
		 Cclass ob=new Cclass();
	 }
	 private static Cclass getref()
	 {
		 return ob;
	 }
	 public static void dis(int x)
	 {
		 System.out.println("display method");
		 System.out.println("value x is:"+x);
	 }
	 public static void main(String args[])
	 {
		 Cclass ob=Cclass.getref();
		 ob.dis(85);
	 }

}
