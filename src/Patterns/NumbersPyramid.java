package Patterns;

public class NumbersPyramid
{
	public static void main(String[] args) 
	{
		
		int n=6;
		//boolean flag=false;
		for(int i=1;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
				for(int j=i-1;j<=i&&j>0;j--)
				{
					System.out.print(j+" ");
				}
			
			
		  System.out.println();
		}	
	}
}