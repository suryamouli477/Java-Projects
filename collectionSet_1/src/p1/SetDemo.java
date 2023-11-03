package p1;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		 
Scanner s=new Scanner(System.in);
 try(s;){
	 try {
		 Set<Integer> ob=null;
		 String nm=null;
		 System.out.println("**choice**");
		 System.out.println("\t1.Hashset"+"\n\t2.LinkedHashset"+"\n\t3.TreeSet");
		 System.out.println("Enter the choice");
		 int choice=s.nextInt();
		 switch(choice)
		 {
		 case 1:
			 ob=new HashSet<Integer>();
			 nm="HashSet";
			 break;
		 case 2:
			 ob=new LinkedHashSet<Integer>();
			 nm="LinkedHashSet";
			 break;
		 case 3:
			 ob=new TreeSet<Integer>();
			 nm="TreeSet";
			 break;
			 default:
				 System.out.println("invalid choice");
				 System.exit(0);
		 }//end of switch
		 
		 System.out.println("---add elements to"+nm+"---");
		 System.out.println("Enter the number of eles: ");
		 int n=s.nextInt();
		 System.out.println("enter"+n+"integer eles:");
		 for(int i=1;i<=n;i++)
		 {
			 ob.add(new Integer(s.nextInt()));
			 
		 }//end loop
		 System.out.println("***display set<E>***");
		 System.out.println(ob.toString());
		 }
	catch(Exception e)
	{
		e.printStackTrace();
	}
	 }
 }
}

	 
 
	
