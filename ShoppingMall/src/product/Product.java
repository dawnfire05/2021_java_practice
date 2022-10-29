package product;

public abstract class Product {
	public String pname;
	public int price;
	
	public void printDetail() {
		System.out.print("��ǰ��: " + pname + " | ");
		System.out.print("����: " + price + " | ");
		printExtra();
	}
	
	public abstract void printExtra();
		
}