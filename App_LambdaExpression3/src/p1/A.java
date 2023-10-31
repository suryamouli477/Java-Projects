package p1;

public class A {
	public static  Icomparable getRef(int choice)
	{
		return switch (choice)
		{
			case 1: yield(int x,int y)->
			{
		       if(x>y)return x;
		       else return y;
		    };
			case 2: yield (int x,int y)->
			{
				if(x<y)return x;
				else return y;
			};
		default : yield null;
	};

}}

