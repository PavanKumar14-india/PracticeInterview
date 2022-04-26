package appliations;

public class KeyRotation
{
	public static void main(String[] args) {
		int a[]={1,68,3,4,5,6,7};
		int key=4;
		for(int i=0;i<key;i++)  
		{
			for(int j=0;j<a.length-1;j++)
			{
				int temp=a[j];  
				a[j]=a[j+1];  
				a[j+1]=temp;  
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
