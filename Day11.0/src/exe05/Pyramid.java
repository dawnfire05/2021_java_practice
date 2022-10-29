package exe05;
import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do {
			System.out.println("몇 단 피라미드입니까");
			n = stdIn.nextInt();
		}while (n<=0);
		
		
		for(int i = 1; i<=n; i++) {

			for(int j = 1; j<=n-i; j++) 
				System.out.print(" ");

			for(int k = 1; k<=i*2-1; k++)
				System.out.print("*");

			System.out.println();
		}
		stdIn.close();
	}

}
