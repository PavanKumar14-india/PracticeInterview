package Arrays;

public class SumofFirstThree {

	public static void main(String[] args)
	{
		int[] a={83,29,14,06,28};
		
		System.out.println("Numbers before sorting ");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+"==>");
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		 
		System.out.println();
		 System.out.println("Numbers after sorting");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+"==>");
		}
		System.out.println();
			int sum=0;
			for(int z=0;z<3;z++)
			{
				sum=sum+a[z];
			}
			System.out.println("Sum of First Three Numbers after sorting in Decending Order");
			System.out.println(sum);
			 
				 
	}
}
