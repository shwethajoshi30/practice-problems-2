package Additional_assignments;
import java.util.*;
public class power_of_num {
public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			System.out.println("Enter the power number");
			int pow=sc.nextInt();
			System.out.println(pow(num,pow));
	sc.close();
		}

		private static int pow(int num, int pow) {
			// TODO Auto-generated method stub
			if (pow==0)
				return 1;
			else return(num*pow(num,pow-1));
			
		}

	}
