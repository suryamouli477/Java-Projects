package p1;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Stringdemo8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		String s1=s.nextLine();
		System.out.println("Enter delimetr:");
		String dl=s.nextLine();
		StringTokenizer ob1=new StringTokenizer(s1,dl);
		System.out.println("String:"+s1);
		//System.out.println("---after reverse---");
		char ch;
		while(ob1.hasMoreTokens())
		{
			String ele=ob1.nextToken();
			StringBuffer sb=new StringBuffer(ele);
			
			  ch=sb.charAt(0);
			  switch(ch)
			  {
			  case 'a':
			  case 'A':
				  System.out.println("reverse is:  "+sb.reverse());
				  break;
			  case 'e':
			  case 'E':
				  System.out.println("reverse is:  "+sb.reverse());
				  break;
			  case 'i':
			  case 'I':
				  System.out.println("reverse is:  "+sb.reverse());
				  break;
			  case 'o':
			  case 'O':
				  System.out.println("reverse is:  "+sb.reverse());
				  break;
			  case 'u':
			  case 'U':
				  System.out.println("reverse is:  "+sb.reverse());
				  break;
				  default:
					  System.out.println("not reverse is:  "+sb);
			  }		
		}
	}
}
