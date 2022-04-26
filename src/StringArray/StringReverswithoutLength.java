package StringArray;

import java.util.Scanner;

public class StringReverswithoutLength {
	
	public static void main(String[] args) {
		System.out.println("Enter the String to reverse");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String rev="";
		char[] arr = str.toCharArray();
		int count=0;
		for (char c : arr) {
			count++;
		}
		
		for(int i=count-1;i>=0;i--)   //without length  function 
		{
			System.out.print(str.charAt(i));
		}
	/*	for(int i=count-1;i>=0;i--)   //3rd variation
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}*/

	
	}
	}
