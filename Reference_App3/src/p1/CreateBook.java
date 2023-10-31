package p1;

public class CreateBook { 
	public BookDetails create(String bCode,String bName,String bAuthor,float bPrice,int bQty)
	{
		BookDetails bd=new BookDetails();
		bd.bCode=bCode;
		bd.bName=bName;
		bd.bAuthor=bAuthor;
		bd.bPrice=bPrice;
		bd.bQty=bQty;
		return bd;
		
		
	}
}
