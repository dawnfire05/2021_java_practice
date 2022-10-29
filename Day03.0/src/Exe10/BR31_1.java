package Exe10;

import java.util.Scanner;

public class BR31_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String end = "ÀÚ³×´Â Á³³×!";
		
		for(int i=0; i<=31;) {
			int n = scan.nextInt();
			
			if(n==1) {
				System.out.println(i+1);
				i+=1;
				if (i>=31) {
					System.out.println(end);
					break;
				}	
			}
			else if(n==2) {
				System.out.println(i+1);
				System.out.println(i+2);
				i+=2;
				if (i>=31) {
					System.out.println(end);
					break;
				}
			}
			else if(n==3) {
				System.out.println(i+1);
				System.out.println(i+2);
				System.out.println(i+3);
				i+=3;
				if (i>=31) {
					System.out.println(end);
					break;
				}
			}
			else {
				System.out.println("¹ÝÄ¢ ¸ØÃç!");
				break;
			}
			
		}
		
		scan.close();
			
	}
}