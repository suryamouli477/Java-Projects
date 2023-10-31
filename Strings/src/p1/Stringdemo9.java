package p1;
import java.util.*;
public class Stringdemo9 {
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
				
			int i=0;
				while(ob1.hasMoreTokens())
				{
					String ele=ob1.nextToken();
					StringBuffer sb=new StringBuffer(ele);
					int len1 = 0;
					//int len1;
					//int m = 0;
					for(i=0;i<=len1-1;i--)
					{
					 ch=sb.charAt(i);
					 int len11=sb.length();
					if(ch==sb.length()-1)
					{
					 
					  switch(ch)
					  {
					  case 'a':
					  case 'A':
						  System.out.println("not reverse is:  "+sb);
						  break;
					  case 'e':
					  case 'E':
						  System.out.println("not reverse is:  "+sb);
						  break;
					  case 'i':
					  case 'I':
						  System.out.println("not reverse is:  "+sb);
						  break;
					  case 'o':
					  case 'O':
						  System.out.println("not reverse is:  "+sb);
						  break;
					  case 'u':
					  case 'U':
						  System.out.println("not reverse is:  "+sb);
						  break;
						  default:
							  System.out.println("reverse is:  "+sb.reverse());
					  }		
				}
			}
		}
	}

	}


