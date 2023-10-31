package p1;
import java.util.*;
public class Srtingdemo2 {
	public static void main(String args[])
	{
          Scanner s=new Scanner(System.in);
          System.out.println("enter string:");
          String s1=s.nextLine();
          int len=s1.length();
          int sum=0;
          int i;
          System.out.println("numbers are:");
          for(i=0;i<=len-1;i++)
          {
        	  char ch=s1.charAt(i);
        	  int k=(int)ch;
        	  if(k>=48&&k<=57)
        	  {
        		  String st=String.valueOf(ch);
        		  int num=Integer.parseInt(st);
        		  sum=sum+num;
        		  System.out.println(ch+" ");
        	  }
        	  
        	  
          }
          System.out.println("sum is:"+sum);

	}
}
