package set2;
import java.text.ParseException;
import java.util.*;
import java.time.*;
public class ticket_46 {
	static int n=0;
	static int id[] = new int[10],age[]=new int[10];
     static long mob_num[]=new long[10];
     static String name[]=new String[10],dob[]=new String[10],cityaddr[]=new String[10];
	static Scanner sc=new Scanner(System.in);
	private static void add()
	{	
		System.out.println("enter number of customers ");
		n=sc.nextInt();	     
		for(int i=0;i<n;i++)
		{
		System.out.println("enter id");
		id[i]=sc.nextInt();
		System.out.println("enter mobile number");
		mob_num[i]=sc.nextLong();	
		System.out.println("enter name");
		name[i]=sc.next();
		System.out.println("enter age");
		age[i]=sc.nextInt();
		System.out.println("enter date of birth");
		dob[i]=sc.next();
		System.out.println("enter address");
		cityaddr[i]=sc.next();
		}
	}
	private static void booking(int[] id,long[] mob_num) throws ParseException 
	{
		System.out.println("enter id");
		int c_id=sc.nextInt();
		System.out.println("enter mobile number");
		long c_mob_num=sc.nextLong();		
		String source,dest,time;
		String date;
		System.out.println("enter source");
		source=sc.next();
		System.out.println("enter destination");
		dest=sc.next();
		//if(source.equals(dest));
		LocalDate nowdate = LocalDate.now();
		System.out.println("enter date of journey in the format yyyy-mm-dd");
		 date=sc.next();
		 LocalDate t1=LocalDate.parse(date);
		System.out.println("enter time of format hh:mm:ss");   
		time=sc.next();
		boolean flag = false; 
		for(int i=0;i<id.length;i++)
		{
			if(c_id==id[i] && c_mob_num==mob_num[i] && !source.equals(dest) && t1.getDayOfMonth()>nowdate.getDayOfMonth()
					&& t1.getMonth()==nowdate.getMonth() && t1.getYear()==nowdate.getYear())
			{
				flag=true;
			}	
		}
		if(flag)
		{
			System.out.println("booking successful");
		}
		else
		{
			System.out.println("not possible to book ticket");
		}
	}
private static void name() {
	for(int i=0;i<n;i++)
    {
        for (int j = i + 1; j < n; j++) 
        { 
            if (name[i].compareTo(name[j])>0) 
            {
                String temp_name =name[i];                   
                name[i] = name[j];
                name[j] = temp_name;
            }
        }
    }
 for(int i=0;i<n;i++) {
	 System.out.println(id[i]+" "+age[i]+" "+name[i]+" "+dob[i]+" "+cityaddr[i]+" "+mob_num[i]);
 }
		
		
	}
	private static void id() {
		for(int i=0;i<n;i++)
        {
            for (int j = i + 1; j < n; j++) 
            { 
                if (id[i]>id[j]) 
                {
                    int temp_id=id[i];
                    int temp_age=age[i];
                    String temp_name =name[i];
                    String temp_dob=dob[i];
                    String cityaddr_temp=cityaddr[i];
                    long mob_temp=mob_num[i];                  
                    
                    name[i] = name[j];
                    cityaddr[i] = cityaddr[j] ;
                    dob[i] = dob[j] ;
                    id[i]=id[j];
                    age[i]=age[j];
                    mob_num[i]=mob_num[j];
                    
                    name[j] = temp_name;
                    cityaddr[j] = cityaddr_temp;
                    dob[j] = temp_dob;
                    id[j]=temp_id;
                    age[j]=temp_age;
                    mob_num[j]=mob_temp;          
                }
            }
        }
	 for(int i=0;i<n;i++) {
		 System.out.println(id[i]+" "+age[i]+" "+name[i]+" "+dob[i]+" "+cityaddr[i]+" "+mob_num[i]);
	 }
		
		
	}
	private static void city() {
		 for(int i=0;i<n;i++)
	        {
	            for (int j = i + 1; j < n; j++) 
	            { 
	                if (cityaddr[i].compareTo(cityaddr[j])>0) 
	                {
	                    int temp_id=id[i];
	                    int temp_age=age[i];
	                    String temp_name =name[i];
	                    String temp_dob=dob[i];
	                    String cityaddr_temp=cityaddr[i];
	                    long mob_temp=mob_num[i];                  
	                    
	                    name[i] = name[j];
	                    cityaddr[i] = cityaddr[j] ;
	                    dob[i] = dob[j] ;
	                    id[i]=id[j];
	                    age[i]=age[j];
	                    mob_num[i]=mob_num[j];
	                    
	                    name[j] = temp_name;
	                    cityaddr[j] = cityaddr_temp;
	                    dob[j] = temp_dob;
	                    id[j]=temp_id;
	                    age[j]=temp_age;
	                    mob_num[j]=mob_temp;          
	                }
	            }
	        }
		 for(int i=0;i<n;i++) {
			 System.out.println(id[i]+" "+age[i]+" "+name[i]+" "+dob[i]+" "+cityaddr[i]+" "+mob_num[i]);
		 }	
	}


	public static void main(String[] args) throws ParseException {
		int ch,h;
		do {
			System.out.println("1.Add customer details\n 2. Book a ticket\n 3.Display Customers\n 4.exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:add();break;
			case 2:booking(id,mob_num);break;
			case 3:
				do{
					System.out.println("1. Display customer based on city names\r\n" + 
					"2. Display customers based on ID\r\n" + 
					"3. Display customer Names in sorted order\n 4.exit ");
			 h=sc.nextInt();
			switch(h) {
			case 1:city();
			break;
			case 2:id();
			break;
			case 3:name();
			break;
			case 4:System.exit(0);
			}
				}while(h!=4);
			break;
			case 4:System.exit(0);
			}
			
		}while(ch!=4);
	}
	
}


	
