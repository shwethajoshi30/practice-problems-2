package set2;
import java.util.Scanner;
public class retail_store_26
{
	static int billid=1222,customerid=345,purchaseid,discount,totaldiscount;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id[]= {5001,5002,5003,5004,5005};
		int price[]= {50,40,60,10,345};
		System.out.println("Enter itemID...");
		int itemid=sc.nextInt();
		System.out.println("Enter quantity...");
		int qty=sc.nextInt();
		
		int flag=0;
		for(int i=0;i<id.length;i++)
		{
			if(id[i]==itemid)
			{
				flag=1;
				int iprice=price[i];
				found(iprice,qty,itemid);
				break;	
			}
		}
		if(flag==0)
		{
			System.out.println("item not found!!!!");
		}
	}
	private static void found(int iprice, int q, int itemid) {
		purchaseid=itemid;
		int billamount=q*iprice;
		System.out.println(billid);
		System.out.println(customerid);
		System.out.println(purchaseid);
		discount=(int) (billamount*10)/100;
		totaldiscount=billamount-discount;
		System.out.println(totaldiscount);
		System.out.println(billamount);
		
	}
}
