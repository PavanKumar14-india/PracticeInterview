package Arrays;

import java.util.Scanner;

public class MaxNumWithScanner {
	public static void main(String[] args) {
		int[] a = new int[5];
	 
		Scanner scan=new Scanner(System.in);
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
		int max=a[0];
		for(int j=1;j<a.length;j++)
		{
			if(max<a[j])
			{
				max=a[j];
			}
		}
		
		System.out.println("The maximum number is "+max);
	}
}
