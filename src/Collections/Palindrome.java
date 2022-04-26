package Collections;

public class Palindrome {
	
	public static void main(String[] args)
	{
		int n=121;
		int rev = 0;
		int num=n;
		int rem;
		while(n!=0)
		{
		
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(num==rev)
		{
			System.out.println(num+" is a palindrome");
		}
		else
		{
			System.out.println(num+" is not a palindrome");
		}
	}

}
