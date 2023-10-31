package p2;
import java.util.*;
import p1.EmpAddress;
import p1.Empcontact;
import p1.Employe;
public class DemoRef2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Employe e =new Employe();
		System.out.println("enter the empid");
		e.empid=s.nextLine();
		System.out.println("enter the empname");
		e.empName=s.nextLine();
		System.out.println("enter the desgnation");
		e.Desg=s.nextLine();
		System.out.println("enter the city");
		e.ea.city=s.nextLine();
		System.out.println("enter the sate");
		e.ea.state=s.nextLine();
		System.out.println("enter the pincode");
		e.ea.pincode=Integer.parseInt(s.nextLine());
		System.out.println("enter the city");
		e.ec.city=s.nextLine();
		System.out.println("enter the phone");
		e.ec.phone =s.nextLong();		
		e.getEmployee();
		e.ea.getempAddress();
		e.ec.getEmpcontact();
	
		s.close();

	}

}
