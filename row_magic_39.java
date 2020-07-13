package set2;
import java.util.Scanner;
import java.util.*;
public class row_magic_39 {
	static int m,n;
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows and columns");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter the values for matrix");

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
            a[i][j]=sc.nextInt();
            }
	
        }
        boolean res=isrowMagic(a);
        System.out.println(res);
	}

	private static boolean isrowMagic(int[][] a)
	{ 
		int sum=0;
		int resarr[]=new int[m];
		
		for(int i=0;i<m;i++)
		{
			sum=0;
			for(int j=0;j<n;j++)
			{
				sum=sum+a[i][j];
				
				
			}
			resarr[i]=sum;
			
		}
		int temp=resarr[0];
		for(int i=0;i<m;i++)
		{
			if(resarr[i]!=temp)
			{
				return false;
			}
		}
		return true;
		
	}

}
