package Assignment;

public class PrimeNum 
{
	public static void main(String[] args) {
		int a=19;
		boolean flag=true;

		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=false;
				break;
			}
		   
		}
		if(flag==true)
		   {
			   System.out.println(a+" is prime number");
		   }
		   else
		   {
			   System.out.println(a+" is not prime number");
		   }
	}
}
