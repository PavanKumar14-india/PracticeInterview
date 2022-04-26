package Arrays;

public class MaximumNumberwithoutScanner {


	public static void main(String[] args)
	{
		int[] a={83,29,14,06,28};
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("The maximum number is "+max);
	}
	
}
