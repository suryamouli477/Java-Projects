package p2;
import p1.*;
public class DemoInner2 {

	public static void main(String[] args) {
		Subclass1 ob1=new Subclass1();// outer class object
		ob1.m1();//outer class method call
		Subclass1.Subclass2 ob2 = ob1.new Subclass2();
		//Instance member InnerClas Object
		ob2.m2();//InnerClass Instance method_call
		Subclass1.Subclass2.m22();
		//InnerClass Static method_call

	}

}
