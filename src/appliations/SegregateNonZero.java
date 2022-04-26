package appliations;

public class SegregateNonZero
{
	public static void main(String[] args) {
		int a[]={1,2,3,2,0,6,0,34,0,0,2};
		int m=0;
		int n=a.length-1;
		int b[]=new int[a.length];
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0)
			{
				b[m]=a[i];
				m++;
			}
			else
			{
				b[n]=a[i];
				n--;
			}
		}
		
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
