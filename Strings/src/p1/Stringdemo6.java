package p1;
import java.util.*;
public class Stringdemo6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String s1=s.nextLine();
		int len1=s1.length();
		int count=0;
		int i;
		for(i=0;i<=len1-1;i++)
		{
			char ch=s1.charAt(i);
			switch(ch)
			{
			case 'a':
			case'A':
				System.out.println("vowels are:"+ch);
				count++;
			break;
			case 'e':
			case'E':
				System.out.println("vowels are:"+ch);
				count++;
			break;
			case 'i':
			case'I':
				System.out.println("vowels are:"+ch);
				count++;
			break;
			case 'o':
			case'O':
				System.out.println("vowels are:"+ch);
				count++;
			break;
			case 'u':
			case'U':
				System.out.println("vowels are:"+ch);
				count++;
			break;
			default:
			System.out.println("inalid");
			
			}
			System.out.println("count of vowels:"+count);
			
		
		
		}
		


	}

}
