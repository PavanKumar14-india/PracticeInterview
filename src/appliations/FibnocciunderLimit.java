package appliations;

public class FibnocciunderLimit 
{
	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3;
		System.out.print(fib1+" "+fib2+" ");
		for(int i=0;i<100;i++)
		{
			fib3=fib1+fib2;
			if(fib3<100)
			{
				System.out.print(fib3+" ");
			}
			else
				break;
			fib2=fib3;
			fib1=fib2;
		}
	}

}
