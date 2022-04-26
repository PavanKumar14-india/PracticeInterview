package appliations;

public class SumofDigits 
{
	public static void main(String[] args) 
	{
		int n=5684;
	    int num=n;
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
			int rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			n=sum;
		}
		System.out.println("Sum is of digits in "+num+" is "+n);
	}

}
