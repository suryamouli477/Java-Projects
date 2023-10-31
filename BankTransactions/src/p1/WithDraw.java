package p1;
@SuppressWarnings("serial")
public class WithDraw extends Exception implements Transaction{
	
		public WithDraw(String msg)
		{
			super(msg);
		}
		
	

	@Override
	public void process(int amt) throws WithDraw {
		{
			try 
			{
				if(amt>b.bal)// Exception
				{
					WithDraw ob=new WithDraw("Insufficient Fund");
					throw ob;
				}
				System.out.println("Amt WithDraw:"+amt);
			    b.bal=b.bal-amt;
			    System.out.println("Balance amt:"+b.getBalance());;
			System.out.println("Transcation completed");
			
			}
			catch(WithDraw ob)
			{
				throw ob;
			}
		}
		
	}
}
