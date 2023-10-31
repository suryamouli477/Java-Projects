package p1;

public class SpyNumber_BLC {
int num;
 public void setData(int num)
 {
	 this.num=num;
 }
 public void getData()
 {int rem,product=0,sum=1;
	 while(num!=0)//1124
	 {
		rem=num%10;
	    sum=sum*rem;//4
	    product=rem+product;//4
	    num=num/10;
	 }
	 if(sum==product)
	 {
		 System.out.println("true");
	 }
	 else System.out.println("false");
 }
}
