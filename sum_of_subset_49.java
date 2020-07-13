package set2;

public class sum_of_subset_49
{
	public static void main(String[] args) {
		int[] s ={1,2,5,6,8};
		int d= 9,flag=0;
		for(int i=0;i<s.length-1;i++)
		{
			flag=0;
			for(int j=i+1;j<s.length;j++)
			{
				for(int k=j+1;k<s.length;k++)
				{
					if(s[i]+s[j]+s[k]==d)
					{
						System.out.println("{"+s[i]+" "+s[j]+" "+s[k]+" "+"}");
					}
					else
					{
						flag=1;
					}
					
				}

			}
		}
		
		for(int p=0;p<s.length-1;p++)
		{
			for(int q=p+1;q<s.length;q++)
			{
				if(s[p]+s[q]==d)
				{
					System.out.println("{"+s[p]+" "+s[q]+" "+"}");
				}
				else
				{
					flag=1;
					
				}
			}
		}

				
	}
}