package Constructor;

public class Pen1 {
	private String brand;
	private int price;
	private String clr;
	
	
	
	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getClr() {
		return clr;
	}



	public void setClr(String clr) {
		this.clr = clr;
	}

	@Override
	public String toString() {
		
		return "Pen[Brand="+brand+", price="+price+",Colour="+clr+" ]";
	}


	public static void main(String[] args) {
		Pen1 pen = new Pen1();
		pen.setBrand("Parker");
		pen.setClr("Black");
		pen.setPrice(14000);
		System.out.println(pen);
	//	System.out.println(pen.getBrand());
	//	System.out.println(pen.getClr());
	//	System.out.println(pen.getPrice());

	}
}
