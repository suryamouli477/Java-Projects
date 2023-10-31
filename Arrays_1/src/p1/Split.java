package p1;
import java.util.*;
public class Split {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter size of array:");
		 int n=s.nextInt();
		 Integer a[]=new Integer[n];
		 System.out.println("enter"+n+"integer elements:");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=new Integer (s.nextInt());
		 }
		 System.out.println("display using old for loop:");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]+" ");
		 }
		 System.out.println("display using enhance for:");
		 for(Integer k:a)
		 {
			 System.out.println(k);
		 }
		 System.out.println("using spliterator:");
		 Spliterator<Integer> sp=Arrays.spliterator(a);
		 sp.forEachRemaining((k)->
		 {
			 System.out.println(k);
		 });
		 

	}
}
