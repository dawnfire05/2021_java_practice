package exe09;
import java.util.Scanner;


public class Q4 {
	static void copy(int[] a, int[] b) {
		int len = b.length >= a.length ? a.length : b.length;
		for(int i = 0 ; i<len; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 a의 길이: ");
		int x[] = new int[scan.nextInt()];
		for(int i = 0; i<x.length; i++)
			x[i] = scan.nextInt();
		
		System.out.print("배열 b의 길이: ");
		int y[] = new int[scan.nextInt()];
		for(int i = 0; i<y.length; i++)
			y[i] = scan.nextInt();
		
		copy(x, y);
		
		System.out.print("복사된 배열 a: ");
		for(int i = 0; i<x.length; i++)
			System.out.print(x[i]);
		
	}
}
