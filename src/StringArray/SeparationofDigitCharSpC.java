package StringArray;

public class SeparationofDigitCharSpC
{
	/*
	public static void main(String[] args) 
	{
		String s="ssdw739r(99e5^&&&*";
		char[] str = s.toCharArray();
		String strChar = "";
		String strNum = "";
		String strSpec = "";
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(str[i]))
			{
				strChar=strChar+str[i];
			}
			else if(Character.isDigit(str[i]))
			{
				strNum=strNum+str[i];
			}
			else
			{
				strSpec=strSpec+str[i];
			}
		}
		System.out.println(strChar+" "+strNum+" "+strSpec);
	}
	*/
	
	public static void main(String[] args) {
		String s="hfdvhh&*T^TcO3434&*$";
		String strChar = "";
		String strNum = "";
		String strSpec = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z'|| s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				strChar=strChar+s.charAt(i);
			}
			else if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				strNum=strNum+s.charAt(i);
			}
			else
			{
				strSpec=strSpec+s.charAt(i);
			}
		}
		System.out.println(strChar+" "+strNum+" "+strSpec);
	}
}