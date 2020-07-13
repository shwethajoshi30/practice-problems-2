package Additional_assignments;
import java.util.*;
public class queue {
	static int max=10;
	static int arr[]=new int[max];
	static int front=-1;
	static int rear=-1;  
	static Scanner sc=new Scanner(System.in);
	private static void enqueue() {
		int ele;
		System.out.println("enter the element to be inserted");
		ele=sc.nextInt();
		
		if(rear == max-1)  
	    {  
	        System.out.println("OVERFLOW");  
	         
	    }  
	    if(front == -1 && rear == -1)  
	    {  
	        front = 0;  
	        rear = 0;  
	    }  
	    else   
	    {  
	        rear = rear+1;  
	    }  
	    arr[rear] = ele;  
	 System.out.println("Element inserted into Queue"); 
		
		
	}

	private static void dequeue() {
		// TODO Auto-generated method stub
		int ele;   
	    if (front == -1 || front > rear)  
	    {  
	        System.out.println("under flow!!");
	              
	    }  
	    else  
	    {  
	        ele = arr[front];  
	        if(front == rear)  
	        {  
	            front = -1;  
	            rear = -1 ;  
	        }  
	        else   
	        {  
	            front = front + 1;  
	        }  
	       System.out.println("Deleted sucessfully!!"+" "+ele);
	    }
		
	}

	private static void display() {
		// TODO Auto-generated method stub
		  int i;  
		    if(rear == -1)  
		    {  
		      System.out.println("Queue is empty"); 
		    }  
		    else  
		    {     
		        for(i=front;i<=rear;i++)  
		        {  
		            System.out.println(arr[i]+" ");  
		        }     
		    }  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		do {
			System.out.println("1.insert an element\n2.Delete an element\n3.Display the queue\n4.Exit\n");
			ch=sc.nextInt();
			switch(ch) {
			case 1:enqueue();  
	            break;  
	            case 2:dequeue();  
	            break;  
	            case 3:display();  
	            break;  
	            case 4:System.exit(0);  
	            break;  
			}
			
		}while(ch!=4);
		sc.close();

	}

	
}