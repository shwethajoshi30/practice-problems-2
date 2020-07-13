package Additional_assignments;
import java.util.Scanner;
public class mat_multiplication {
		
		static int m,n;

		public static void main(String[] args) {
			System.out.println("enter the values for no of rows and columns");
			Scanner sc=new Scanner(System.in);
			m=sc.nextInt();
			n=sc.nextInt();
			int a[][]=new int[m][n];
			int b[][]=new int[m][n];
			int c[][]=new int[m][n];
			System.out.println("enter the matrix a");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					a[i][j]=sc.nextInt();
			System.out.println("enter the matrix b");
			for(int i=0;i<m;i++)
				for(int j=0;j<n;j++)
					b[i][j]=sc.nextInt();
			for(int i=0;i<n;i++){    
				for(int j=0;j<n;j++){    
				c[i][j]=0;      
				for(int k=0;k<n;k++)      
				{      
				c[i][j]+=a[i][k]*b[k][j];      
				}
				}
			}
			System.out.println("the multiplication of two matrix is");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
			sc.close();


		}

	}
