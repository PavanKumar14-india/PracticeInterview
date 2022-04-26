package Arrays;

public class SwapTwoNum {

	public static void main(String[] args) {
		int a=14;
		int b=28;
		System.out.println("Before Swapping Two Values "+ a +"  "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping Two Values "+ a +"  "+b);
	}
}
