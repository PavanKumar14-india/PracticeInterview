package Assignment;

public class PrimeNumberArray {
	public static void main(String[] args) {
		int[] a={2,3,4,5,7,9,11,22,44,19};
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
				   flag=false;
				   break;
				}
				else
					flag=true;	
			}
			if(flag==true)
			{
				System.out.println(num+" is prime number");
			}
			else
			{
				System.out.println(num+" is not a prime number");
			}
		}
	}
}
