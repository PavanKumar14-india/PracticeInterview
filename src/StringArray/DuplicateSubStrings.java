package StringArray;

import java.util.LinkedHashSet;

public class DuplicateSubStrings {

	public static void main(String[] args) {
		String s="welcome to to testyantra";
		String[] str1 = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		
		for(String str:str1)
		{
			System.out.println(str);
			set.add(str);
		}
		for(String str2: set)
		{
			int count=0;
			for(String str3: str1)
			{
				if(str3.equals(str2))
				{
					count++;
				}
			}
			if(count>1)
			System.out.println(str2+" "+count);
		}
	}
}
