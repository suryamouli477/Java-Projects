package p1;

import java.util.Scanner;

public class Stringdemo5 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter string1:");
		String s1=s.nextLine().trim();
		System.out.println("enter string2:");
		String s2=s.nextLine().trim();
		int k=s1.compareTo(s2);
		if(k==0)
		{
			System.out.println("strings are equal:");
		}
		else if(k>0)
		{
			System.out.println(s1+"greater than"+s2);
		}
		else {
			System.out.println(s1+"lessthan"+s2);
		}
		int l=s1.compareToIgnoreCase(s2);
		if(l==0)
		{
			System.out.println("strings are equal:");
		}
		else if(l>0)
		{
			System.out.println(s1+"greater than"+s2);
		}
		else {
			System.out.println(s1+"lessthan"+s2);
		}
		s.close();

	}

}
