package Assignment;

public class AddArrays {
			
	public static void main(String[] args) {
		int[] a={1,2,3,4,23,12,23,67};
		int[] b={2,32,33,32,2,2};
		if(a.length>b.length)
		{
			System.out.println("The sum of the arrays");
			for(int i=0;i<b.length;i++)
			{
				a[i]=a[i]+b[i];
			
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print("==>"+a[i]);
			}
	
		}
		else
		{
			System.out.println("The sum of the arrays");
			for(int i=0;i<a.length;i++)
			{
				b[i]=a[i]+b[i];
			
			}
			for(int i=0;i<b.length;i++)
			{
				System.out.print("==>"+b[i]);
			}		
		}
		
	}
}
