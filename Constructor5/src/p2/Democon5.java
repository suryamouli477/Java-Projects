package p2;
import p1.*;
import java.util.*;
public class Democon5 {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Student details-1");
    System.out.println("Enter the rollno:");
    String rolln1=s.nextLine();
    System.out.println("Enter the name:");
    String nm1=s.nextLine();
    Student ob1=new Student(rolln1,nm1);//con call1
    System.out.println("Student details-1");
    System.out.println("Enter the rollno:");
    String rolln2=s.nextLine();
    System.out.println("Enter the name:");
    String nm2=s.nextLine();
    Student ob2=new Student(rolln2,nm2);//con call2
    System.out.println("stu-1");
    ob1.getStudent();
    System.out.println("stu-2");
    ob2.getStudent();
	}

}
