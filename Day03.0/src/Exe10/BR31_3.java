package Exe10;
import java.util.Scanner;
public class BR31_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		for(int a = 0; a<31;) {
			int b = scanner.nextInt();
			if (b<=3) {
				for(int i = 1; i<=b; i++) {
					a++;
					if (a>31) break;
					System.out.println(a);
				}	
			}
			else break;
		}
		System.out.println("³¡!");
		scanner.close();
	}
}