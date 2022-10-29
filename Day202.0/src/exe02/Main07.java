package exe02;
import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			for(int m = 1; m < n-i; m++) System.out.print(" ");
			
			for(int k = 0; k <= 2*i ; k++) System.out.print("*");
			
			System.out.println();
		}
		
		for(int i = 1; i <= n; i++) {
			
			for(int m = 0; m < i; m++) System.out.print(" ");
			
			for(int k = 0; k < 2*n-2*i-1 ; k++) System.out.print("*");
			
			System.out.println();
		}

		scn.close();
	}

}
