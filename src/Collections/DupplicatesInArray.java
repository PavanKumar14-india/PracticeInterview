package Collections;

import java.util.LinkedHashSet;

public class DupplicatesInArray {

	public static void main(String[] args) {
		int[] num={2,1,33,4,2,22,3,121,22};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
			set.add(num[i]);
		}
		
		for(Integer n:set)
		{
			int count = 0;
			for(int i=0;i<num.length;i++)
			{
				if(n==num[i])
				{
					 count++;
				}
				
			}
			System.out.println(n+" num of Occurance is "+ count);
		}
	}
	
}
