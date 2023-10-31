package p2;
import p1.*;
import java.util.Scanner;
public class DemoRef3 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the bookcode:");
	String bc=s.nextLine();
	System.out.println("enter the bookname:");
	String bn=s.nextLine();
	System.out.println("enter the bookauthor:");
	String ba=s.nextLine();
	System.out.println("enter the bookprice:");
	float bp=s.nextFloat();
	System.out.println("enter the bookqty:");
	int bq=s.nextInt();
	CreateBook cb =new CreateBook();
BookDetails bd=cb.create(bc, bn, ba, bp, bq);
DisplayBookDetails dbd=new DisplayBookDetails();
dbd.dis(bd);


	}

}
