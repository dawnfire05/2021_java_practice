package Exe09;

public class Gugudan {

	public static void main(String[] args) {
		int i, j; 
		for(i=2; i<10; i++) {
			System.out.println("## " + i + "�� ##");
			for(j=1; j<10; j++){
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}		
	}
}