package Arrays;

import java.util.Scanner;

public class FirstMaxSecondMax {

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
		
	int fmax=0;
	int smax=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>fmax)
		{
			smax=fmax;
			fmax=a[i];
			
		}
		else if(smax<a[i])
		{
			smax=a[i];
		}
	}
	System.out.println("the first max num is ==>"+fmax+" Second Max num is ==>"+smax);
}	
}
