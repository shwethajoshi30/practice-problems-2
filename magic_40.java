package set2;
import java.io.*; 
public class magic_40 {
	    static int N = 3; 
	    static boolean isMagic(int a[][]) 
	    { 
	        int sum = 0,sum2=0;  
	        for (int i = 0; i < N; i++) 
	            sum = sum + a[i][i]; 
	  
	        for (int i = 0; i < N; i++) 
	            sum2 = sum2 + a[i][N-1-i]; 
	  
	        if(sum!=sum2)  
	            return false; 
	  
	        // For sums of Rows 
	        for (int i = 0; i < N; i++) { 
	  
	            int rowSum = 0; 
	            for (int j = 0; j < N; j++) 
	                rowSum += a[i][j]; 
	  
	           
	            if (rowSum != sum) 
	                return false; 
	        } 
	  
	        // For sums of Columns 
	        for (int i = 0; i < N; i++) { 
	  
	            int colSum = 0; 
	            for (int j = 0; j < N; j++) 
	                colSum += a[j][i]; 
	  
	            if (sum != colSum) 
	                return false; 
	        } 
	  
	        return true; 
	    } 
	    public static void main(String[] args) 
	    { 
	        int a[][] = {{ 2, 7, 6 }, 
	                       { 9, 5, 1 }, 
	                       { 4, 3, 8 }}; 
	        boolean res=isMagic(a);
	        System.out.println(res);
	    } 
	} 
