package p1;
import java.util.*;
public class Employee_ELC {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the emp number");
		//int empnumber=Integer.parseInt(s.nextLine());
		int empnumber=s.nextInt();
		System.out.println("enter the  empname");
		String  empname=s.nextLine();
		empname=s.nextLine();
		
		System.out.println("Enter the empsal:");
		int sal=s.nextInt();
		EmployeeBLC ob=new EmployeeBLC( empnumber,  empname, sal);
		 if (ob.getEmpsal()>=90000)
		 {
		 
			System.out.println("this employee is developer"+ob.getEmpsal());
		 }
		 else if (ob.getEmpnumber()>=60000 && ob.getEmpsal()<90000)
		 {
		 
			System.out.println("this employee is dsg"+ob.getEmpsal());
		 }
		 else if (ob.getEmpsal()>=40000)
		 {
		 
			System.out.println("this employee is tester"+ob.getEmpsal());
		 }
		 else
		 {
			 System.out.println("invalid");
		 }

	}

}
