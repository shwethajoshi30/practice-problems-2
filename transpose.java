package Additional_assignments;
import java.util.Scanner;
public class transpose {

	static int m,n;
	 static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the value for no of rows and columns");
		m=sc.nextInt();
		n=sc.nextInt();
		int trans[][]=new int[m][n];
		int arr[][]=new int[m][n];
		System.out.println("enter the values for matrix");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
	
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				trans[i][j]=arr[j][i];
			}
		}
		System.out.println("the tanspose of matrix is");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}



	}
}