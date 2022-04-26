package StringArray;

import java.util.LinkedHashSet;

public class CountVowelsCharacters {
	
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
		
		  int count=0;
		  int scount=0;
			if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
			 {
				char che = chr; 
				count++;
				 
				  if(count>=1)
				  { 
					  int j=0;
					  while(j<s.length())
					  {   
						
						  char ch = str[j];
						  					switch (ch)
						  					{
						  						case 'a':if(che==ch)
						  								scount++;
						  								break;
						  						case 'e':if(che==ch)
						  								scount++;
						  								break;
						  						case 'i':if(che==ch)
					  								     scount++;
					  								     break;
						  						case 'o':if(che==ch)
					  								     scount++;
					  								     break;
						  						case 'u':if(che==ch)
					  								     scount++;
					  								     break;
						  						default:break;
							                 }
						   
						   
						  j++;
					  }
				  }
				 System.out.println(chr+"="+scount);
			 }
	     }
	}

}
