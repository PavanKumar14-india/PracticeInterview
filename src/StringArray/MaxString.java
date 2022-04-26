package StringArray;

import java.util.Scanner;

public class MaxString {

		 
			public static void main(String[] args)
			{
				
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter the length of the array");
				int length=scan.nextInt();
				String[] str= new String[length];
			 
				System.out.println("Enter the array of String elements");
				for(int i=0;i<str.length;i++)
				{
					str[i]=scan.next();
				}
				
				
				System.out.println("Enter Strings");
					
					for(int z=0;z<str.length;z++)
					{
						System.out.print(str[z]+"==>");
					}
					System.out.println();
					
			String max=str[0];
			
			for(int i=1;i<str.length;i++)
			{
				if(max.length()<str[i].length())
				{
					max=str[i];
				}
			}
			System.out.println("The max length string is");
			for(int j=0;j<str.length;j++)
			{
				if(max.length()==str[j].length())
				{
					System.out.print("==>"+str[j]);
				}
			}
		}
}
