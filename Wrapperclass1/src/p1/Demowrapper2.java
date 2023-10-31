package p1;
public class Demowrapper2 {
	public static void main(String[] args) {
		Integer ob1=12;
		Float ob2=23.67F;
		Double ob3=1234.56;
		Character ob4='s';
		Boolean ob5=true;
		System.out.println("values are:");
		System.out.println("int value:"+ob1);
		System.out.println("Float value:"+ob2);
		System.out.println("Double value:"+ob3);
		System.out.println("Character value:"+ob4);
		System.out.println("Boolean value:"+ob5);
		//AutounBoxingMethod
		int i1=ob1;
		float f=ob2;
		double d=ob3;
		char c=ob4;
		boolean b=ob5;
		System.out.println("****unBoxing metho:*****");
		System.out.println("int value:"+i1);
		System.out.println("float value:"+f);
		System.out.println("double value:"+d);
		System.out.println("char value:"+c);
		System.out.println("boolean value:"+b);

	}

}
