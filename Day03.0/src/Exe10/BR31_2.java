package Exe10;

import java.util.Scanner;

public class BR31_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b=1;
		int n=0;
		for(int a = b; a<=31; a++) {
			int i = scan.nextInt();
			for(b = a; b<=i; b++) {
				n=n++;
				System.out.println(n);
			}
		}
	scan.close();
	}
}