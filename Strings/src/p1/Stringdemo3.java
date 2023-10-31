package p1;
import java.util.Scanner;
public class Stringdemo3 {
	public static void main(String[] args) 
	{
           Scanner s=new Scanner(System.in);
           System.out.println("enter string1:");
           String s1=s.nextLine();
           System.out.println("enter string2:");
           String s2=s.nextLine();
          /* boolean k=s1.equals(s2);
           if(k)
           {
        	   System.out.println("Strigs are equal:");
           }
           else {
        	   System.out.println("strings are not equal:");
           }*/
           System.out.println("equals method:");
          if( s1.equals(s2))
          {
        	  System.out.println("same");
          }
          else {
        	  System.out.println("not same:");
          }
          System.out.println("ignore case:");
          if(s1.equalsIgnoreCase(s2))
          {
        	  System.out.println("strings are same:");
          }
          else {
        	  System.out.println("strings are not equal:");
          }
	}

}
