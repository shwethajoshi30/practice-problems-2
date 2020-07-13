package set2;
import java.util.Scanner;
public class book_store_28 {
	private String title,author_name,price;
	int yop;
	public book_store_28(String title,String author_name,String price,int yop) {
		this.title=title;
		this.author_name=author_name;
		this.price=price;
		this.yop=yop;
		System.out.println(title+" "+author_name+" "+price+" "+yop);
		}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		book_store_28 b =new book_store_28("Robinson Crusoe","Daniel Defoe","$15.50",1719 );
		book_store_28 b1=new book_store_28("Heart of Darkness","Joseph Conrad", "$12.80",1902);
		book_store_28 b2=new book_store_28("Beach Music","Pat Conroy","$9.50",1996);
}
}