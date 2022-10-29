package exe04;
import java.util.Scanner;


public class TriangleLU {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형");
		
		do {
			System.out.print("몇 단 삼각형입니까");
			n = stdIn.nextInt();
		}while (n<=0);
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n+1-i; j++)
				System.out.print("*");
			System.out.print("\n");
			stdIn.close();
		}
	}

}
