package StringArray;

import java.util.LinkedHashSet;

public class CountVowelsType2 
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
		 
			for(Character chr: set)
			{
				if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
				{
					int count = 0;
					for(int i=0;i<str.length;i++)
					{
						if(chr==str[i])
						{
							count++;
						}
					}
					System.out.println(chr+"="+count);
				}
			}
	   }

}
