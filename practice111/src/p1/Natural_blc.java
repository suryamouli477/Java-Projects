package p1;

public class Natural_blc {
	int num1;
	int num2;
	public void getRange(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void getData()
	{
		int c=num1-1;
		if(c==num2)
		{
			System.out.println("-4");
		}
		else if(num1<0)
		{
			System.out.println("-1");
		}
		else if(num1==num2)
		{
			System.out.println("-2");
		}
		else if(num1<num2)
		{
			System.out.println("-3");
		}
		else
		for(int i=c;i>num2;i--)
		{
			System.out.print(i+" ");
		}
		 
	}

	}
 

