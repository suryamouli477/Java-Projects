package p1;
//import p2.Natural_blc;
import java.util.Scanner;

public class Natural_Elc {

	public static void main(String[] args) {
		 
      Scanner s=new Scanner(System.in);
      System.out.println("enter num1:");
      int num1=s.nextInt();
      System.out.println("enter num2:");
      int num2=s.nextInt();
      Natural_blc ob=new Natural_blc();
      ob.getRange(num1, num2);
      ob.getData();
      s.close();
      
	}

}
