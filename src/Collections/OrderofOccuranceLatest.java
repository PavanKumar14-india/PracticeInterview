package Collections;

import java.util.LinkedHashSet;

public class OrderofOccuranceLatest {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
			set.add(s.charAt(i));
			System.out.println(set);
		}
		
		for(Character ch:set)
		{
			for(int i=s.length()-1;i>=0;i--)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" character order of occurance is "+(i+1));
					break;
				}
			}
		}
		
	}
}
