package set2;

import java.util.Scanner;

public class palindrome_50
{
	public static void main(String[] args)
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("1.check for number input \n 2.check for string input\n 3.exit");
		System.out.println("enter choice:....");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:int r,sum=0,temp,num; 
				num=sc.nextInt();
				temp=num;    
				while(num>0)
				{    
						r=num%10;  //getting remainder  
						sum=(sum*10)+r;    
						num=num/10;    
				}    
				if(temp==sum)    
						System.out.println(num+ " is palindrome");    
				else    
						System.out.println(num+"is not palindrome");
				
				break;
				
		case 2:System.out.println("enter string");
				String str=sc.next();
	        	int i = 0, j = str.length() - 1; 
	        	boolean flag = true;
	 	        while (i < j) 
	 	        { 
	  	            if (str.charAt(i) != str.charAt(j)) 
	  	            		flag=false;
	  	            	i++; 
	  	            	j--; 
	 	        } 
	 	        if(flag==false)
	 	        	  System.out.println(str+ "is not palindrome");
	 	        else
	 	        System.out.println(str+ " is palindrome");
	 	     
	 	        break;
	 	        
		}
	    
		}while(ch!=3);

	}

}
