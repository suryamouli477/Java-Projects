package p1;

public class Div implements IArithmetic {

	@Override
	public float calculate(int x, int y) {
		if (x>0 && y>0) return x/y;
		else return 0;
	}

}
