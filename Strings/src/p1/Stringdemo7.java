package p1;
import java.util.*;
public class Stringdemo7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string:");
		String s1=s.nextLine();
		System.out.println("Enter delimetr:");
		String dl=s.nextLine();
		StringTokenizer ob1=new StringTokenizer(s1,dl);
		StringTokenizer ob2=new StringTokenizer(s1,dl);
		System.out.println("String is:"+s1);
		System.out.println("count of tokens:"+ob1.countTokens());
		while(ob1.hasMoreElements())
		{
			String ele=(String)ob1.nextElement();
			System.out.println("token:"+ele);
		}
		while(ob2.hasMoreTokens())
		{
			String ele=ob2.nextToken();
			System.out.println("token:"+ele);
		}
		}

}
