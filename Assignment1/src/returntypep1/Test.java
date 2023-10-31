package returntypep1;
class Test {
      int getgretest(int x,int y)
{
	if(x<0||y<0)
	{
		return -1;
	}
	else if(x==0||y==0)
	{
		return -2;
	}
	else if(x>y)
	{
		return x;
	}
	else
	{
		return y;
	}
}
}
