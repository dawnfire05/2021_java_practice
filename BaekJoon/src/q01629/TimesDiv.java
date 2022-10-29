package q01629;

import java.util.Scanner;

public class TimesDiv {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int result = (A ^ B) % C;
		System.out.println(result);
		
		scan.close();
	}
}
