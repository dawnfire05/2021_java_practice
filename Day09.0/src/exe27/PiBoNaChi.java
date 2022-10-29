package exe27;

import java.util.Scanner;

public class PiBoNaChi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = 1;
		int c = 1;
		
		int n = scan.nextInt();
	
		if(n==0)
			System.out.println(a);
		
//			else if (n==2)
//				System.out.println(b);

		else {
			for(int i = 0; i < n-1; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(c);
		}

		scan.close();
	}

}
