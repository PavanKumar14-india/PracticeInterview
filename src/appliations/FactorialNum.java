package appliations;

public class FactorialNum 
{
	/*
	public static void main(String[] args) {
		int num=6;
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			
			fact=fact*i;
		}
		System.out.println(fact);
	}  */

	public static void main(String[] args) {
		int num=5;
		int result=factorial(num);
		System.out.println("factorial of "+num+" is "+result);
	}

     static int factorial(int num)
     {
	 	if(num==1||num==0)
	 	{
	 		return 1;
	 	}
	 	else	
		return (num*factorial(num-1));
     }
	
	
}
