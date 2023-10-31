package p1;
import java.util.*;
public class Palindrom {
	public  static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=s.nextInt();
		int r,p=0,temp=n;
		 while(n!=0)
		 {
			 r=n%10;
			 p=(p*10)+r;
			 n=n/10;
			 
			 
		 }
		 if(temp==p)
		 {
			 System.out.println("given number is polindrome"+n);
		 }
		 else
		 {
			 System.out.println("not a polindrome:");
		 }
		
	}
	

}
