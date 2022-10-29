package Exe12;

public class galaxy {

	public static void main(String[] args) {
		String[] products = {"애플 아이폰", "삼성 갤럭시", "노키아 루미아", "소니 엑스페리아"}; 

		for(int i = 0; i<products.length; i++) {
			System.out.println(products[i]);
		}
		
		System.out.println("----------------------------");
		
		for(String s : products) {
			System.out.println(s);
		}
	}
}
