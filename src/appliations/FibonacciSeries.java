package appliations;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3=0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("The first "+n+" fibnocci numbers are");
		System.out.print(fib1+" ");
		System.out.print(fib2+" ");
		for(int i=0;i<n-2;i++) //including 0,1   for excluding 0,1 is==>(for(int i=0;i<10;i++))
		{
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");
		}
		
		
	}
}
