package p1;

public class Week {
	public  static  String ringAlaram(int a,boolean b)
	{
		 if(a>=1 && a<=5)
			 if(b)return "10.00";//t
			 else return "7.00";	//f	
	
	 if(a==0 || a==6)	
	 {
		 if(b)return "off"; //t
		 else return "10.00";//f
	 }
	return "invalid";
	}
}
