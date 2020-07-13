package Additional_assignments;
import java.util.*;
public class stack {
		int max=10;
		int arr[]=new int[max];
		int top=-1;
		public void menu() {
			System.out.println("1:push");
			System.out.println("2:pop");
			System.out.println("3:peek");
			System.out.println("4:display");
			System.out.println("5:exit");
		}
		public void push() {
			if(top==max-1) {
				System.out.println("Stack is full!!");
			}
			else {
				System.out.println("enter the element to be inserted into stack");
				Scanner ss=new Scanner(System.in);
				int e=ss.nextInt();
				top=top+1;
				arr[top]=e;
				ss.close();
			}
		}
		public void pop() {
			if(top==-1) {
				System.out.println("stack is empty!!");
			}
			else {
				top--;
				System.out.println("element is deleted");
			}
		}
		//which retrieves the first element of stack
		public void peek() {
			if(top==-1) {
				System.out.println("stack is empty!!");
			}
			else {
				System.out.println(arr[top]);
			}
			
		}
		public void display() {
			if(top==-1) {
				System.out.println("stack is empty!!");
			}
			else {
				for(int i=top;i>=0;i--) {
					System.out.println(arr[i]);
				}
			}
			
		}
		
		

		public static void main(String[] args) {
			int ch;
			Scanner sc=new Scanner(System.in);
			stack s=new stack();
			do {
				s.menu();
				ch=sc.nextInt();
				switch(ch) {
				case 1:s.push();
					   break;
				case 2:s.pop();
				break;
				case 3:s.peek();
				break;
				case 4:s.display();
				break;
				case 5:System.exit(0);
				}
				
			}
			while(ch!=5);
			sc.close();
			}
		
			

		}
