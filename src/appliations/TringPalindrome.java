package appliations;

public class TringPalindrome
{
	public static void main(String[] args) {
		String str="afeefa";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println(str+" is palindrome");
		}
		else
		{
			System.out.println(str+" is not a palindrome");
		}
	}

}
