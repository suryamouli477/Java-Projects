package p1;

public class Smallervalue  implements Icomparable{

	@Override
	public int comparedto(int x, int y) {
		if (x<y) return x;
		else return y;
	}

}
