package Interfaces;

public class FunctionalInterfaceDemo 
{
	public static void main(String[] args) 
	{
			InterfaceObjectDemo iObj=()->{  //Lamda Expression to give implementation for interface
				System.out.println("Implementation is done!!!");
			};	
			
			iObj.add();
	}
		
}
