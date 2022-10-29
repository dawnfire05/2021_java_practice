package exe06;

public class Main {
	public static void main(String[] args) {
		Fruit Fruit1 = new Fruit();
		Fruit1.type = "Apple";
		Fruit1.number = 5;
		System.out.println(Fruit1.type);
		System.out.println(Fruit1.number);
		
		Fruit Fruit2 = new Fruit();
		Fruit2.type = "Grape";
		Fruit2.number = 2;
		System.out.println(Fruit2.type);
		System.out.println(Fruit2.number);
		
		Fruit Fruit3 = new Fruit();
		Fruit3.type = "Banana";
		Fruit3.number = 3;
		System.out.println(Fruit3.type);
		System.out.println(Fruit3.number);
		
		Fruit1.Sell(1);
		Fruit2.Buy(7);
		Fruit3.Sell(3);
		
		System.out.println(Fruit1.number);
		System.out.println(Fruit2.number);
		System.out.println(Fruit3.number);
	}
}
