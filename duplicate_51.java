package set2;
public class duplicate_51 
{
	public static void main(String[] args)
	{int c = 0;
		//int a[]= new int[]{4,4,7,8,8,9};
		int a[]=new int [] {3,6,5,7,8,19,32};
	
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j])
					{
						 c=a[i];
						System.out.print(c+ " ");
					}
			
			}
		}
		if (c==0)
		{
			System.out.print("-1");
		}
		
	}
}
