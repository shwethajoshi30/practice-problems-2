package Additional_assignments;
import java.util.*;
public class fib {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			System.out.print("Fibonacci Series of " + n + " is:");
			for(int i = 0; i < n; i++){
					System.out.print(fib(i) +" ");
				}
			sc.close();

		}

		private static int fib(int n) {
			// TODO Auto-generated method stub
			if(n == 0){
				return 0;
			}
			if(n == 1 || n == 2){
					return 1;
				}
			return fib(n-2) + fib(n-1);
		}

	}
