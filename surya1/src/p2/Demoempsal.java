package p2;

import java.util.Scanner;
import p1.Employesal;
public class Demoempsal {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter bsal:");
		int bSal=s.nextInt();
		Employesal ob =new Employesal();
		 float totSal=ob.cal(bSal);
		 System.out.println("total:"+totSal);
	}

}
