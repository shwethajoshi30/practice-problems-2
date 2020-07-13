package set2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class customer_31 {
	private static String name;
	private static String mob_no;
	private static double rating;
	public customer_31() 
	{
		
	}
	public customer_31(String name,String mob_no,double rating)
	{
		this.name=name;
		this.mob_no=mob_no;
		this.rating=rating;
	}
	//name
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	//mobile number
	public String getMobile_num()
	{
		return mob_no;
	}
	public void setMobile_num(String mob_no)
	{
		this.mob_no=mob_no;
	}
	//rating
	public double getRating()
	{
		return rating;
	}
	public void setRating(double rating)
	{
		this.rating= rating;
	}
	
	public static void main(String[] args) 
	{
		int n=2;
		 //List<customer> cl = new ArrayList<>(n);
		customer_31 c=new customer_31();
		Scanner sc=new Scanner(System.in);
		 for(int i=0;i<n;i++)
		 {
			 System.out.println((i+1)+"customer details");
		        System.out.println("name");
		        name = sc.next();
		        c.setName(name);
		        System.out.println("mobile number");
		        mob_no = sc.next();
		        c.setMobile_num(mob_no);
		        System.out.println("rating");
		        rating = sc.nextDouble();
		        c.setRating(rating);
		 }
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("customer "+ (i+1) + ":"+c.getRating() +"  out of 5");
		 }
}
}
