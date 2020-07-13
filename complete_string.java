package Additional_assignments;
import java.util.*;
public class complete_string {
		public static void main(String[] args)
	    {
	        System.out.println( checkAllChars( "ABCDEFGHIJKLMNOPQRSTUVWxyz" ) );
	       
	    }
	      
	    private static String checkAllChars ( String input )
	    {
	        
	        if(input.length() < 26)
	        {
	            return "FALSE";
	        }
	                  
	        for (char ch = 'A'; ch <= 'Z'; ch++)
	        {
	            if (input.indexOf(ch) < 0 && input.indexOf((char) (ch + 32)) < 0)
	            {
	                return "FALSE";
	            }
	        }
	        return "TRUE";
	    }    
	    }
