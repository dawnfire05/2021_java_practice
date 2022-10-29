package q02869;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();
		
		if (1<=B & A>B & A<=V) {
			
			int p = 0;
			int n = 1;
			
			for(n=0; p<V; n++) {
				
				p = p+A;
				p = p-B;

			}
			
			System.out.println(n);
		}
		scan.close();
	}

}
