package set2;
import java.util.*;
public class bank_47 {

		static int n;
		static String accno[]=new String[10],name[]=new String[10],acctype[]=new String[10],addr[]=new String[10],dob[]=new String[10];
		static float bal[]=new float[10];
		static Scanner sc=new Scanner(System.in);
		private static void create() {
			System.out.println("Enter the number of customers");
			n=sc.nextInt();
			for(int i=0;i<n;i++) {
				System.out.println("enter the Account no");
				accno[i]=sc.next();
				System.out.println("enter the name");
				name[i]=sc.next();
				System.out.println("enter the acc type as saving loan and current");
				acctype[i]=sc.next();
				System.out.println("enter the addr");
				addr[i]=sc.next();
				System.out.println("enter the dob");
				dob[i]=sc.next();
				System.out.println("enter the balance");
				bal[i]=sc.nextInt();			
			}		
		}
		private static void address() {
			System.out.println("sorting customers based on addrress");
			for(int i=0;i<n;i++)
	        {
	            for (int j = i + 1; j < n; j++) 
	            { 
	                if (addr[i].compareTo(addr[j])>0) 
	                {
	                    String temp_id=accno[i];
	                    float temp_bal=bal[i];
	                    String temp_name =name[i];
	                    String temp_dob=dob[i];
	                    String cityaddr_temp=addr[i];
	                    String temp_acctyp=acctype[i];                 
	                    
	                    name[i] = name[j];
	                    acctype[i] = acctype[j] ;
	                    dob[i] = dob[j] ;
	                    accno[i]=accno[j];
	                    addr[i]=addr[j];
	                    bal[i]=bal[j];
	                    
	                    name[j] = temp_name;
	                    acctype[j] = temp_acctyp;
	                    dob[j] = temp_dob;
	                    accno[j]=temp_id;
	                    addr[j]=cityaddr_temp;
	                    bal[j]=temp_bal;          
	                }
	            }
	        }
			for(int i=0;i<n;i++) {
					System.out.println("Accno"+accno[i]+" "+"name"+name[i]+" "+"Acctype"+acctype[i]+"Address"+addr[i]+" "+"dateofborth"+dob[i]+" "+"Balance"+bal[i]);
				
			}
			

			
		}
		private static void nonzero() {
			int flag=0;
			for(int i=0;i<n;i++) {
				if(bal[i]>0) {
					System.out.println("Accno"+accno[i]+" "+"name"+name[i]+" "+"Acctype"+acctype[i]+"Address"+addr[i]+" "+"dateofborth"+dob[i]+" "+"Balance"+bal[i]);
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("No customer balance is greater than zero");
			}		
			
		}
		private static void name() {
			String nameip;
			int flag=0;
			System.out.println("Enter the name to view the user details");
			nameip=sc.next();
			for(int i=0;i<n;i++) {
				if(nameip.equals(name[i])) {
					System.out.println("Accno"+accno[i]+" "+"name"+name[i]+" "+"Acctype"+acctype[i]+"Address"+addr[i]+" "+"dateofborth"+dob[i]+" "+"Balance"+bal[i]);
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("invalid Account no");
			}
			
		}
		private static void basedonid() {
			String accnou;
			int flag=0;
			System.out.println("Enter the accno to view the user details");
			accnou=sc.next();
			for(int i=0;i<n;i++) {
				if(accnou.equals(accno[i])) {
					System.out.println("Accno"+accno[i]+" "+"name"+name[i]+" "+"Acctype"+acctype[i]+"Address"+addr[i]+" "+"dateofborth"+dob[i]+" "+"Balance"+bal[i]);
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("invalid Account no");
			}
			
		}



		private static void delete() {
			int pos;
		    System.out.print("Enter the position u wanna delete");
		    pos=sc.nextInt();
			for(int  i=pos;i<n;i++)
			{
				name[i] = name[i+1];
	            acctype[i] = acctype[i+1] ;
	            dob[i] = dob[i+1] ;
	            accno[i]=accno[i+1];
	            addr[i]=addr[i+1];
	            bal[i]=bal[i+1];
			}
			//to print traverse loop till 2nd last element
			
			for(int i=0;i<n;i++) {
				System.out.println("Accno"+accno[i]+" "+"name"+name[i]+" "+"Acctype"+acctype[i]+"Address"+addr[i]+" "+"dateofborth"+dob[i]+" "+"Balance"+bal[i]);
			
		}
			
		}
		private static void sortid() {
			System.out.println("sorting customers based on accno");
			for(int i=0;i<n;i++)
	        {
	            for (int j = i + 1; j < n; j++) 
	            { 
	                if (accno[i].compareTo(accno[j])>0) 
	                {
	                    String temp_id=accno[i];
	                    float temp_bal=bal[i];
	                    String temp_name =name[i];
	                    String temp_dob=dob[i];
	                    String cityaddr_temp=addr[i];
	                    String temp_acctyp=acctype[i];                 
	                    
	                    name[i] = name[j];
	                    acctype[i] = acctype[j] ;
	                    dob[i] = dob[j] ;
	                    accno[i]=accno[j];
	                    addr[i]=addr[j];
	                    bal[i]=bal[j];
	                    
	                    name[j] = temp_name;
	                    acctype[j] = temp_acctyp;
	                    dob[j] = temp_dob;
	                    accno[j]=temp_id;
	                    addr[j]=cityaddr_temp;
	                    bal[j]=temp_bal;          
	                }
	            }
	        }
			for(int i=0;i<n;i++) {
					System.out.println("Accno"+accno[i]+" "+"name"+name[i]+" "+"Acctype"+acctype[i]+"Address"+addr[i]+" "+"dateofborth"+dob[i]+" "+"Balance"+bal[i]);
				
			}
			
			
		}


		private static void changename() {
			String accnou,name;
			int flag=0;
			accnou=sc.next();
			for(int i=0;i<n;i++) {
				if(accnou.equals(accno[i])) {
					System.out.println("Enter the name to be changed");
					name=sc.next();
					addr[i]=name;
					flag=1;
									
				}
			}
			if(flag==1)
			System.out.println("Address changed sucessfully!!");
			else
				System.out.println();
			
			
		}
		
		private static void changeaddr() {
			String accnou,adr;
			int flag=0;
			accnou=sc.next();
			for(int i=0;i<n;i++) {
				if(accnou.equals(accno[i])) {
					System.out.println("Enter the address to be changed");
					adr=sc.next();
					addr[i]=adr;
					flag=1;
									
				}
			}
			if(flag==1)
			System.out.println("Address changed sucessfully!!");
			else
				System.out.println();
			
			
		}
		public static void main(String[] args) {
			int ch,p,q;
			do {
				System.out.println("1:create bank user\n2:update user details\n3:delete user details\n4:display user details\n5:exit");
				ch=sc.nextInt();
				switch(ch) {
				case 1:create();
				break;
				case 2:do {
					System.out.println("1:Address\n2:Name\n3:Exit");
					q=sc.nextInt();
					switch(q) {
					case 1:changeaddr();
					break;
					case 2:changename();
					break;
					case 3:System.exit(0);
					}
				}while(q!=3);
				break;
				case 3:delete();
				break;
				case 4:do {
					System.out.println("1:Display user details based on ID\r\n" + 
							"2: Display user details based on Name\r\n" + 
							"3: Display all users who have non-zero balance\r\n" + 
							"4: Display user sorted based on address (location wise)\r\n" + 
							"5: Display users sorted based on account id \n6:exit");
					p=sc.nextInt();
					switch(p) {
					case 1:basedonid();
					break;
					case 2:name();
					break;
					case 3:nonzero();
					break;
					case 4:address();
					break;
					case 5:sortid();
					break;
					case 6:System.exit(0);
					}
				}while(p!=6);
				case 5:System.exit(0);	
				}
			}while(ch!=5);

		}
	
	}