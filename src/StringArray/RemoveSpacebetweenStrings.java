package StringArray;

public class RemoveSpacebetweenStrings {
	public static void main(String[] args) {
		String str="I am a Senior Test Engineer";
		String[] strarr = str.split(" ");
		for(int i=0;i<strarr.length;i++)
		{
			String arr=strarr[i];
			for(int j=arr.length()-1;j>=0;j--)
			{
				System.out.print(arr.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
