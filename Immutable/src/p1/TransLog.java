package p1;
import java.util.*;
public final class TransLog {
	private final long haccno,baccno;
	private final float amnt;
	private final Date datetime;
	public TransLog(long haccno,long baccno,float amnt,Date datetime)
	{
		this.haccno=haccno;
		this.baccno=baccno;
		this.amnt=amnt;
	    this.datetime=datetime;
	}
	public final long getHaccno() {
		return haccno;
	}
	public final long getBaccno() {
		return baccno;
	}
	public final float getAmnt() {
		return amnt;
	}
	public final Date getDatetime() {
		return datetime;
	}

	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	try(s;){
		try {
			System.out.println("enter Home Account Number:");
			long haccno=s.nextLong();
			System.out.println("Enter Benificiery Account Number");
			long baccno=s.nextLong();
			System.out.println("Enter amount:");
			float amnt=s.nextFloat();
			TransLog ob=new TransLog(haccno,baccno,amnt,new Date());
			System.out.println("Transaction Details");
			System.out.println("haccno:"+ob.getHaccno());
			System.out.println("baccno:"+ob.getBaccno());
			System.out.println("amnt:"+ob.getAmnt());
			System.out.println("datetime:"+ob.getDatetime());
			
}
		catch(Exception e) {
			e.printStackTrace();}
		}
}
	

}
