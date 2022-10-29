package product;

public abstract class Product {
	public String pname;
	public int price;
	
	public void printDetail() {
		System.out.print("상품명: " + pname + " | ");
		System.out.print("가격: " + price + " | ");
		printExtra();
	}
	
	public abstract void printExtra();
		
}