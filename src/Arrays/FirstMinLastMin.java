package Arrays;

import java.util.Scanner;

public class FirstMinLastMin {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the length of the array");
		int length=scan.nextInt();
		int[] a = new int[length];
	 
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
	System.out.println("Enter Numbers");
		
		for(int z=0;z<a.length;z++)
		{
			System.out.print(a[z]+"==>");
		}
		System.out.println();
	
	int fmin=Integer.MAX_VALUE;
	int smin=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<fmin)
		{
			smin=fmin;
			fmin=a[i];
			
		}
		else if(smin>a[i])
		{
			smin=a[i];
		}
	}
	System.out.println("the first min num is ==>"+fmin+" Second Min num is ==>"+smin);
}	

}
