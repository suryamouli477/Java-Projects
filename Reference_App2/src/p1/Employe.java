package p1;

public class Employe {
	public String empid,empName,Desg;
	public EmpAddress ea= new EmpAddress();
	public Empcontact ec= new Empcontact();
	public void getEmployee()
	{
		System.out.println("empid:"+empid);
		System.out.println("empname:"+empName);
		System.out.println("desgnation"+Desg);
	}

}
