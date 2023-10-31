package returntypep1;
import java.util.Scanner;
import returntypep1.Test;

public class Assignment2 {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
  System.out.println("enter value1");
  int x=s.nextInt();
  System.out.println("enter value2");
  int y=s.nextInt();
  Test ob = new Test();
  int res=ob.getgretest(x, y);
  System.out.println("result is"+res);
	  
	
	
}
}
