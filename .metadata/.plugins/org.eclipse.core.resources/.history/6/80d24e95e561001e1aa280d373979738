package p1;

import java.util.*;

public class Smain {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n=s.nextInt();
		Student a[]=new Student[n];
		System.out.println("enter"+n+1+"student details:");
		
		//float percentage;
		//System.out.println("percentage is:"+percentage);
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=new Student();
			System.out.println("enter Student roll:");
			a[i].Sroll=s.nextLine();
			System.out.println("enter Student name:");
			a[i].Sname=s.nextLine();
			System.out.println("enter branch:");
			a[i].branch=s.nextLine();			
			System.out.println("Enter subject-1 marks:");
			int sub1=s.nextInt();
			System.out.println("Enter subject-2 marks:");
			int sub2=s.nextInt();
			System.out.println("Enter subject-3 marks:");
			int sub3=s.nextInt();
			System.out.println("Enter subject-4 marks:");
			int sub4=s.nextInt();
			System.out.println("Enter subject-5 marks:");
			int sub5=s.nextInt();
			System.out.println("Enter subject-6 marks:");
			int sub6=s.nextInt();
			int totalmarks=sub1+sub2+sub3+sub4+sub5+sub6;
			a[i].percentage=a[i].totalmarks+((totalmarks/600)*100);
			System.out.println("totalmarks are:"+totalmarks);
			System.out.println("percentage is:"+(totalmarks/600)*100);
			if(totalmarks<200)
				System.out.println(" failed:");
			else if(totalmarks>200 &&totalmarks<300)
			System.out.println("third class");
			else if(totalmarks>300 &&totalmarks<400)
				System.out.println("second class");
			else if(totalmarks>400 &&totalmarks<600)
				System.out.println("first  class");
			
			}
		for(Student k:a)
		{
			System.out.println(k);
			
		}
	}

}
