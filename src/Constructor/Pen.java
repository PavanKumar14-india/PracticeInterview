package Constructor;

public class Pen {

	private String brand;
	private int price;
	private String clr;
	
	//Constructor
	
/*	public Pen(String clr,int price,String brand) 
	{
	 this.clr=clr;
	 this.brand=brand;
	 this.price=price;
	}
	*/
	
	@Override
	public String toString() {
		
		return "Pen[Brand="+brand+", price="+price+",Colour="+clr+" ]";
	}

	
		public static void main(String[] args) {
		//	Pen pen = new Pen("White", 15000, "Reynolds");
			Pen pen = new Pen();
			System.out.println(pen);
	//		System.out.println(pen.clr);
	//		System.out.println(pen.price);
	//		System.out.println(pen.brand);
			
			System.out.println("================*****================");
			
		//	Pen pen1 = new Pen();
		//	System.out.println(pen1);
		//	System.out.println(pen1.clr);
		//	System.out.println(pen1.price);
		//	System.out.println(pen1.brand);
		}
}
