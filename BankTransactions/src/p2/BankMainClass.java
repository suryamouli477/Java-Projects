package p2;
import p1.*;
import java.util.*;


public class BankMainClass extends Exception
{
	public BankMainClass(String msg)
	{
	super(msg);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		try
		{
			int count=0;
			xyz:while(true)
			{
				try
				{
					System.out.println("Enter the pin:");
					int pinNo=s.nextInt();
					if(!(pinNo>=1111&& pinNo<=9999))
					{
						BankMainClass bmc= new BankMainClass("invalid pinNo...");
						throw bmc;
					}
					boolean k=new  Checkpin().verify(pinNo);
					if(!k)//exceptiion
					{
						BankMainClass bmc=new BankMainClass("pin donot exits...");
						throw bmc;
					}
					System.out.println("***choice***");
					System.out.println("\t1.withdraw"+"\n\t2.Deposit");
					System.out.println("enter the choice:");
					int choice=s.nextInt();
					switch(choice)
					{
					case 1:
						try
						{
							System.out.println("Enter the amount:");
							int a1=s.nextInt();
							if(!(a1>0 && a1%100==0))
							{
								BankMainClass bmc= new BankMainClass("invalid amount...");
								throw bmc;
							}
							WithDraw wd=new WithDraw("");
							wd.process(a1);
						}//end try
						catch(BankMainClass bmc)
						{
						System.out.println(bmc.getMessage());
						}
						catch(WithDraw ob)
						{
						System.out.println(ob.getMessage());
						}
						break xyz;//Stop the loop
					case 2:
						try
						{
						System.out.println("Enter the amt:");
						int a2 = s.nextInt();
						if(!(a2>0 && a2%100==0))
						{
						BankMainClass bmc=new BankMainClass
						("Invalid Amt..");
						throw bmc;
						}

						Deposit dp = new Deposit();
						dp.process(a2);
						}//end of try
						catch(BankMainClass bmc)
						{
						System.out.println(bmc.getMessage());
						}
						break xyz;//stop the loop
					default:
						System.out.println("Invalid Choice...");
						break xyz;//stop the loop
						}//end of switch
						}//end of try
				catch(BankMainClass bmc)
				{
				System.out.println(bmc.getMessage());
				count++;
				if(count==3)
				{
				System.out.println("Transaction Blocked..");
				break;//loop is stopped
				}

				}
				}//end of loop
				}//end of try
		finally
		{
		s.close();
		}
					}
				
			
		
	}

