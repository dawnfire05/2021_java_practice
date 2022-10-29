package exe02;

import java.util.Scanner;

public class JaRitSu2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int ja = 0;
		int q = 0;
		
		do {
			q = n/10;
			ja++;
		} while (q>0);
		
		System.out.println(ja);
		
		scan.close();

	}

}
