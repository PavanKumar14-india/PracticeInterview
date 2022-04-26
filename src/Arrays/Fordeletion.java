package Arrays;

public class Fordeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={12,23,45,56};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]==arr[j]){
					int temp=arr[i]-arr[j];
					arr[i]=temp;
					
				}
				
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
