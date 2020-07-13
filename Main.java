//35th exercise
package set2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
	public class Main
	{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of students");
	int n=sc.nextInt();
	stu s[]=new stu[n];
	stu max=new stu();
	String name,branch;
   	int id,score;
   	int maximum=0;
   	for(int i=0;i<n;i++)
   	{
   		s[i]=new stu();
   		System.out.println("enter id");
   		id=sc.nextInt();
   		System.out.println("enter name");
   		name=sc.next();
   		System.out.println("enter branch");
   		branch=sc.next();
   		System.out.println("enter score");
   		score=sc.nextInt();
   		s[i].stu(id,name,branch,score);
   		
   	}
   	for(int i=0;i<n;i++)
   	{
   		if(maximum < s[i].score)
   		{
   			maximum=s[i].score;
   			max=s[i];
   			
   		}
   	}
   max.display();   
	}
	}
   class stu {
    String name,branch;
   	int id,score;
   	public void stu(int id,String name,String branch,int score)
   	{
   		this.id=id;
   		this.name=name;
   		this.branch=branch;
   		this.score=score;	
   	}
    public void display() {
    	System.out.println("id is: " + id);
    	System.out.println("name is: " + name);
    	System.out.println("branch is: " + branch);
    	System.out.println("score is: " + score);
}
}
