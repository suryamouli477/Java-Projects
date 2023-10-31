package p2;
import p1.*;
public class DemoGen {

	public static void main(String[] args) {
		 Pclass ob=(Pclass) new Cclass();
		 ob.m1(21);
		 ob.m2(22);
		 Cclass ob2=(Cclass) new Pclass();
		 ob2.m3(24);
	}

}
