package exe14;
import java.util.Scanner;

public class SearchQ2 {
	
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while (true) {
			if (i==n)
				return -1;
			if(a[i] == key)
				return i;
			i++;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
//		System.out.print("¿ä¼Ú¼ö: ");
//		int num = stdIn.nextInt();
		int x[] = {6,4,3,2,1,9,8};
		int k = 3;
		
		System.out.printf("%4s", "|");
		for(int i = 0; i<x.length; i++) {
			System.out.printf("%3d", i);
		}
		System.out.print("\n---+---------------------------------------------------");
		
		int n = seqSearch(x, x.length, k);
		
		for(int i = 0; i<=n; i++) {
			System.out.printf("\n%4s", "|");
			for(int z = 0; z<i; z++) {
				System.out.printf("%4s", "|");
				System.out.printf("%3s", "*");
				System.out.print("\n");
				System.out.printf("%4s", "|");
			}
			for(int b = 0; b<x.length; b++) {
				System.out.printf("%3d", x[b]);
			
			}
		}
	}
}
