package p1;

public class Student {
public String rollNo,name;

public Student(String rollNo,String name)
{
	this.rollNo=rollNo;
	this.name=name;
}
public void getStudent()
{
	System.out.println("Student Details");
	System.out.println("student rollno:"+rollNo);
	System.out.println("student name:"+name);
}
}
