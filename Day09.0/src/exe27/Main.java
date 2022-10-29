package exe27;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		System.out.println(fibonachi(n));
		scan.close();
	}
	
	public static int fibonachi(int n){
		if(n <= 1)
		return n;
		
		else
		return fibonachi(n-1) + fibonachi(n-2);
	}

}
