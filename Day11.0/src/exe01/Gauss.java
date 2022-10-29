package exe01;

import java.util.Scanner;

public class Gauss {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		int d = i+1;
//		int result = 0;
//
//		for(int n = 1; n<i/2+1; n++) {
//			result = result + d;
//			
//		}
//		
//	System.out.println(result);
		
		int n = scan.nextInt();
		int result = (n+1)*(n/2);
		
		System.out.println(result);
		scan.close();
	}

}
