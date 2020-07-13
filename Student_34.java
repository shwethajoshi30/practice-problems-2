package set2;
import java.util.*;
public class Student_34 {
static int records;
	    static String student_name[];
	    static int student_id[];
	    static String branch[];
	    static void create_record()
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number of records to be created:");
	        records = sc.nextInt();
	        student_name = new String[records];
	        student_id = new int[records];
	        branch = new String [records];
	        for(int i=0;i<records;i++)
	        {
	            System.out.println("\n"+(i+1)+" Student Name:");
	            student_name[i] = sc.next();
	            System.out.println((i+1)+" Student ID:");
	            student_id[i] = sc.nextInt();
	            System.out.println((i+1)+" Student Branch:");
	            branch[i] = sc.next();
	        }
	    }
	    static void display_names()
	    {
	        //sort branch
	       for(int i=0;i<records;i++)
	        {
	            for (int j = i + 1; j < records; j++) 
	            { 
	                if (branch[i].compareTo(branch[j])>0) 
	                {
	                    String temp_branch = branch[i];
	                    int temp_id = student_id[i];
	                    String temp_name = student_name[i];
	                    
	                    branch[i] = branch[j];
	                    student_id[i] = student_id[j] ;
	                    student_name[i] = student_name[j] ;
	                    
	                    branch[j] = temp_branch;
	                    student_id[j] = temp_id;
	                    student_name[j] = temp_name;
	                }
	            }
	        }
	 
	        //displaying names
	        for(int i=0;i<records;i++)
	        {
	           for (int j = i + 1; j < records; j++) 
	            { 
	                if ( (branch[i].equals(branch[j]))  && (student_name[i].compareTo(student_name[j])>0 ) ) 
	                {
	                    String temp_branch = branch[i];
	                    int temp_id = student_id[i];
	                    String temp_name = student_name[i];
	                    
	                    branch[i] = branch[j];
	                    student_id[i] = student_id[j] ;
	                    student_name[i] = student_name[j] ;
	                    
	                    branch[j] = temp_branch;
	                    student_id[j] = temp_id;
	                    student_name[j] = temp_name;
	                }
	              
	            }
	        }
	        for(int i=0;i<records;i++)
	        {
	            System.out.println(student_id[i]+" "+student_name[i]+" "+branch[i]);
	        }
	        
	            
	        
	    }
	    static void display_id()
	    {
	        //sorting student id
	        for(int i=0;i<records;i++)
	        {
	            for (int j = i + 1; j < records; j++) 
	            { 
	                if (student_id[i]> student_id[j]) 
	                {
	                    String temp_branch = branch[i];
	                    int temp_id = student_id[i];
	                    String temp_name = student_name[i];
	                    
	                    branch[i] = branch[j];
	                    student_id[i] = student_id[j] ;
	                    student_name[i] = student_name[j] ;
	                    
	                    branch[j] = temp_branch;
	                    student_id[j] = temp_id;
	                    student_name[j] = temp_name;
	                }
	            }
	        }
	        //displaying 
	        for(int i=0;i<records;i++)
	        {
	            System.out.println(student_id[i]+" "+student_name[i]+" "+branch[i]);
	        }
	    }
		public static void main(String[] args) 
		{
		    Scanner sc = new Scanner(System.in);
		    int choice;
		    do
		    {
		        System.out.println("1. Create record\n2. Display Student names\n3. Display Student ID\n4. Exit\nEnter your choice:");
		        choice = sc.nextInt();
		        switch(choice)
		        {
		            case 1: Student_34.create_record();break;
		            case 2: Student_34.display_names();break;
		            case 3: Student_34.display_id();break;
		            case 4: System.exit(0);
		        }
		        
		    }while(choice!=4);
			
		}
	}
