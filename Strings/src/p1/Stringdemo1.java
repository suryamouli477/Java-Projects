package p1;
import java.util.*;
public class Stringdemo1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;
		int count=0;
		System.out.println("enter string:");
		String s1=s.nextLine();
		int len =s1.length();
		//char ch=s1.charAt(3);
		System.out.println("string is:"+s1);
		System.out.println("string lenght is:"+len);
		//System.out.println("char at index value is:"+ch);
		for(i=0;i<=len-1;i++)
		{
			char ch=s1.charAt(i);
		try(s;)
		{	
			switch (ch)
			{
			case 'a':
			case 'A':
				System.out.println(ch+" ");
				count++;
				break;
			case 'e':
			case 'E':
				System.out.println(ch+" ");
				count++;
				break;
			case 'i':
			case 'I':
				System.out.println(ch+" ");
				count++;
				break;
			case 'o':
			case 'O':
				System.out.println(ch+" ");
				count++;
				break;
			case 'u':
			case 'U':
				System.out.println(ch+" ");
				count++;
				break;
			}
		}
		}
		System.out.println("count is:" +count);
	}

}
