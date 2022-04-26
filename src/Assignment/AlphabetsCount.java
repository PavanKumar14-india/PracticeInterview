package Assignment;

public class AlphabetsCount 
{
	public static void main(String[] args) 
	{
		String s="aabbccraaa";
		for(int i=0;i<s.length();i++)
		{   
			int count=1;
				for ( int j = i+1; j < s.length(); j++) 
				{
							if(s.charAt(i)==s.charAt(j))
							{
									count++;
									if(j==s.length()-1)
									{
										i=j;
									}
							}
							else
							{
								  i=j-1;
								  break;					 
							}
				}
			System.out.println(s.charAt(i)+" "+count);
	     }	
	}
}
