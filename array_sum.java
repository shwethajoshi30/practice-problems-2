package Additional_assignments;
import java.util.*;
public class array_sum {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n;
			System.out.println("Enter the no of elements in array");
			n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
									
			System.out.print(sum(arr,n));
			sc.close();
			
					
		}

		private static int sum(int[] arr, int n) {
			// TODO Auto-generated method stub
			if(n<=0)
				return 0;
			else return sum(arr,n-1)+arr[n-1];
			
		}

	}