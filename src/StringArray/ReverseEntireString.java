package StringArray;

public class ReverseEntireString {

	public static void main(String[] args) {
		String str="I am a Senior Test Engineer";
		String[] strarr = str.split(" ");
		for(int i=strarr.length-1;i>=0;i--)
		{
			System.out.print(strarr[i]+" ");
		}
	}
}
