package p1;
import java.util.*;
public class Student
{
	public String Sname,Sroll,branch,result;
	int totalmarks;
	int marks;
	int percentage;
    public String toString()
	{
		return Sroll+"\t"+Sname+"\t"+branch+"\t"+totalmarks+"\t"+percentage+"\t"+result;
	}
}
