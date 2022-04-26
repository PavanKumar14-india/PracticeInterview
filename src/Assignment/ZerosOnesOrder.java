package Assignment;

public class ZerosOnesOrder 
{
		public static void main(String[] args)
		{
			int[] a={1,1,0,1,0,0,1,1};
			int[] b=new int[a.length];
			int n=b.length-1;
			int j = 0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==0)
				{
					b[n]=a[i];
					n--;
				}
				else
				{
					b[j]=a[i];
					j++;
				}
			}
			 
			for(int i=0;i<b.length;i++)
			{
				System.out.print(b[i]+" ");
			}
		}
}
