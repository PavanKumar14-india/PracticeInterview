package StringArray;

import java.util.LinkedHashSet;

public class CountVowelsOne
{
	public static void main(String[] args)
	   {
			String s="testyantra";
			char[] str = s.toCharArray();
			LinkedHashSet<Character> set=new LinkedHashSet<>();
				for(Character c:str)
				{
					set.add(c);
				}
				int count=0;
			    for(Character chr: set) //for duplicates to count  set = str
			   {
			    	
			    	if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
			    	{
			    		count++;
			    		System.out.print(chr);
			    	}
		       }
			    System.out.print("="+count);
		}

}
