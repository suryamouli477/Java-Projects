package p2;
import p1.*;
import p1.Display;
import p1.User;

public class DemoGeneric {

	public static void main(String[] args) {
   Display<Integer> ob1=new Display<Integer>();
ob1.setob(new Integer(123));
System.out.println("ob1:"+ob1.getob());
Display<String> ob2=new Display<String>();
ob2.setob(new String("suryait"));
System.out.println("ob2:"+ob2.getob());
Display<User> ob3=new Display<User>();
ob3.setob(new User("surya"));
System.out.println("ob3:"+ob3.getob());
	}

}
