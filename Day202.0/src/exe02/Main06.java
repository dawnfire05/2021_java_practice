package exe02;
import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			for(int k = 0; k <= i; k++){
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}

		scn.close();
	}

}
