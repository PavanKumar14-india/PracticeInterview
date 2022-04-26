package Collections;

import java.util.LinkedHashSet;

public class ArrayOrderofOccurance{
	
	public static void main(String[] args) {
		int[] num={2,1,33,4,223,121};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
			set.add(num[i]);
		}
		
		for(Integer n:set)
		{
			for(int i=0;i<num.length;i++)
			{
				if(n==num[i])
				{
					System.out.println("the position of number "+n+" is "+(i+1));
				}
			}
		}
	}
	
	

}
