package p1;
public class Demowrapper1 {
	public static void main(String[] args) {
		Integer ob1=new Integer(12);
		Integer ob2=new Integer("13");
		Float ob3=new Float(12.34F);
		Float ob4=new Float(1234.34);
		Float ob5=new Float("82.34F");
		Character ob6=new Character('a');
		Boolean ob7=new Boolean(true);
		Boolean ob8=new Boolean("false");
		System.out.println("values are:");
		System.out.println("int value:"+ob1);
		System.out.println("int value:"+ob2);
		System.out.println("float value:"+ob3);
		System.out.println("float value:"+ob4);
		System.out.println("float value:"+ob5);
		System.out.println("char value:"+ob6);
		System.out.println("boolean value:"+ob7);
		System.out.println("boolean value:"+ob8);
		int i1=ob1.intValue();
		int i2=ob2.intValue();
		float f1=ob3.floatValue();
		double f2=ob4.doubleValue();
		float f3=ob5.floatValue();
		char c=ob6.charValue();
		boolean b1=ob7.booleanValue();
		boolean b2=ob8.booleanValue();
		System.out.println("****unBoxing method:*****");
		System.out.println("int value:"+i1);
		System.out.println("int value:"+i2);
		System.out.println("float value:"+f1);
		System.out.println("float value:"+f2);
		System.out.println("float value:"+f3);
		System.out.println("char value:"+c);
		System.out.println("boolean value:"+b1);
		System.out.println("boolean value:"+b2);
		
		
	

	}

}
