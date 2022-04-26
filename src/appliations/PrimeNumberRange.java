package appliations;

public class PrimeNumberRange 
{
	public static void main(String[] args) {
		int start=1;
		int end=30;
		boolean flag = true;
		for(int i=start;i<=end;i++)
		{
			int num = i;
			for(int j=2;j<num;j++)
			{
				if(num%j==0)
				{
					flag=false;
					break;
				}
				else
				{
					flag=true;
				}
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
