package appliations;

public class SumofDigittsinSTring 
{
	public static void main(String[] args) {
		String s="a111b22c30";
		char[] ch = s.toCharArray();
		int sum=0;
		int sum1=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum=sum*10+(s.charAt(i)-48);
			}
			else{
				sum1=sum1+sum;
				sum=0;
			}
		}
		System.out.println(sum1+sum);
	}

}
