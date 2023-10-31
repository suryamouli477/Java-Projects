package p2;
import java.util.*;
import p1.*;

public class DemoMap {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try(s;)
	{
		try
		{
			Map<String,ProductValues> ob=null;
			String nm=null;
			while(true)
			{
			  System.out.println("**choice**");
			  System.out.println("\t1.HashMap"
			                     +"\n\t2.LinkedHashMap"
					             +"\n\t3.TreeMap"
			                     +"\n\t4.Hashtable"
					             +"\n\t5.Exit");
			  System.out.println("Enter the choice:");
			  switch(Integer.parseInt(s.nextLine()))
			  {
			  case 1:
				  ob=new HashMap<String,ProductValues>();
				  nm="HashMap";
				  break;
			  case 2:
				  ob=new LinkedHashMap<String,ProductValues>();
				  nm="LinkedHashMap";
				  break;
			  case 3:
				  ob=new TreeMap<String,ProductValues>();
			      nm="TreeMap";
			      break;
			  case 4:
				  ob=new Hashtable<String,ProductValues>();
				  nm="Hashtabel";
				  break;
			  case 5:
				 System.out.println("operation stoped.."); 
				 System.exit(0);
			 default:
				 System.out.println("invalid choice...");
				continue;	 
			  }//end switch
			  System.out.println("---date from"+nm+"---");
			  ob.put(new String("A222"),new ProductValues("CDR",1600,16));
			  ob.put(new String("c234"),new ProductValues("FDD",1700,17));
			  ob.put(new String("B111"),new ProductValues("MOU",1100,11));
			  ob.put(new String("D123"),new ProductValues("PDD",1600,16));
			  ob.forEach((p,q)->
			  {
				 System.out.println(p+"\t"+q); 
			  });
			  System.out.println("perform Operations on"+nm);
			  xyz:while(true)
			  {
				System.out.println("***choice***");
				System.out.println("\t1.put(k,v)"
				                     +"\n\t2.remove(object)"
						             +"\n\t3.get(object)"
				                     +"\n\t4.keyset()"
						             +"\n\t5.value()"
				                     +"\n\t6.Exit");
				System.out.println("Enter the choice");
				switch(Integer.parseInt(s.nextLine()))
				{
				case 1:
					System.out.println("***Add product Details***");
					System.out.println("Enter the ProductCode:");
					String pc=s.nextLine();
					System.out.println("Enter the productName:");
					String pn=s.nextLine();
					System.out.println("Enter the productPrice:");
					float pp=Float.parsefloat(s.nextLine());
					System.out.println("Enter the Productqty:");
					int pq=Integer.parseInt(s.nextLIne());
					
					ob.put(new String(pc), new ProductValues(pn,pp,pq));
					System.out.println("product Details add to"+nm+"successfull");
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
					default:
				
				}
			  }
			}
		}
	}

	}

}
