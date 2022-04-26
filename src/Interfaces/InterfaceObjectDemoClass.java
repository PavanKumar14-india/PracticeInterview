package Interfaces;

public class InterfaceObjectDemoClass  
{
	public static void main(String[] args)
	{
		InterfaceObjectDemo iObj = new InterfaceObjectDemo(){   //Object creation for interface Demo
		
		public void add()
		{
			System.out.println("implementation is done!!!");
		}};
		
		iObj.add();
	}
	
	 
}
