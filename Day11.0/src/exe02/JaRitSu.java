package exe02;

import java.util.Scanner;

public class JaRitSu {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
			int n;
			
			do {
				System.out.print("nÀÇ °ª: ");
				n = stdIn.nextInt();
			}while (n<=0);
		
			int na = 0;
			int i = 0;
			
			for(i=0; na<10 && na>=1; i++) {
				int t = 1;
				na = n / t;
				t *= 10;
				
				System.out.println(i);
			}
			stdIn.close();
	}

}
