package Patterns;

public class Pyramid
{
	public static void main(String[] args) {
		int n=5;
		 
			for (int  i= 1; i <=n; i++) 
			{
				for(int j=n;j>=i;j--)
				{
					System.out.print("  ");
				}
				
				for(int j=i;j>0;j--)
				{
					System.out.print("* ");
				}
				for(int j=i-1;j<i&&j>0;j--)
				{
					System.out.print("* ");
				}
				System.out.println();
			}	
			
		/*	for(int i=1;i<=n;i++)	 
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("  ");
				} 
				for(int j=i;j<n;j++)
				{
					System.out.print("* ");
				}
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
						*/
	}	  
}
