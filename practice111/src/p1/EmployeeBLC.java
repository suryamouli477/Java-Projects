package p1;

public class EmployeeBLC {
	private int  empnumber;
	private String empname;
	private double sal;
	EmployeeBLC( int empnumber, String empname, double sal)
	{
		this.empnumber=empnumber;
		this.empname=empname;
		this.sal=sal;
	}
	public final int getEmpnumber() {
		return empnumber;
	}
	public final void setEmpnumber(int empnumber) {
		this.empnumber = empnumber;
	}
	public final String getEmpname() {
		return empname;
	}
	public final void setEmpname(String empname) {
		this.empname = empname;
	}
	public final double getEmpsal() {
		return sal;
	}
	public final void setEmpsal(double sal) {
		this.sal = sal;
	
	}
	 
}
