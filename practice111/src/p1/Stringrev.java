package p1;

public class Stringrev {

	public static void main(String[] args) {
		 String str="boku mawa";
		 int len=str.length();
		// char ch=str.charAt();
		 int count=0;
		 
		 for(int i=str.length()-1;i>=0;i--)
		 {
		
			 System.out.print(str.charAt(i));
			 count++;
			
			
		 }
		 //char ch=(int)count;
		 
		 //System.out.println(len);
		 System.out.println("\ncount"+count);

	}

}
