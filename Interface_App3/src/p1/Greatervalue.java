package p1;

public class Greatervalue implements Icomparable {
public int compareto(int x,int y)
{
	if (x<y) return x;
	else return y;
}

@Override
public int comparedto(int x, int y) {
	// TODO Auto-generated method stub
	return 0;
}
}
