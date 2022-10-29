package q15596;

class Test {
    long sum(int[] a) {
		long sum = 0;	// a 배열 정수 합 변수
        
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
/*import java.util.Scanner;

public class Intnplus {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		long a[] = new long[scanner.nextInt(n)];
		long sum = 0;
		for (int i = 0 ; i <a.length; i++) {
			a[i] = scanner.nextLong();
			sum += a[i];
		}
				
		scanner.close();
	}

}
*/