package p1;

import java.util.Scanner;

public class SpyNumber_ELC {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter num:");
		 int num=s.nextInt();
		 SpyNumber_BLC ob=new SpyNumber_BLC();
		 ob.setData(num);
          ob.getData();
          s.close();
	}

}
