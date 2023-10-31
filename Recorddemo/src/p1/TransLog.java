package p1;
import java.util.*;
public record TransLog(long haccno,long baccno,float amnt,Date datetime) {
	

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		try(s;){
			try {
				System.out.println("enter Home Account Number:");
				long haccno=s.nextLong();
				System.out.println("Enter Benifisiry Account Number:");
				long baccno=s.nextLong();
				System.out.println("Enter Amount:");
				float amnt=s.nextFloat();
				TransLog ob=new TransLog(haccno,baccno,amnt,new Date());
				System.out.println("Transaction Details");
				System.out.println("haccno:"+ob.haccno());
				System.out.println("baccno:"+ob.baccno);
				System.out.println("amnt:"+ob.amnt);
				System.out.println("datetime:"+ob.datetime);
		}
			catch(Exception e)
			{
				
			}
		}
	}
}
