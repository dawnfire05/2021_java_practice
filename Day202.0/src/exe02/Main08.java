package exe02;
import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int N = scn.nextInt();
		
		int num[] = new int[N];
		
		for(int i = 0; i < N; i++) num[i] = scn.nextInt();
		
		int max = num[0];
		int min = num[0];
		
		for(int k = 0; k < N; k++) 
			
			if(num[k] < min) min = num [k];
			
		for(int j = 0; j < N; j++) 
			
			if(num[j] > max) max = num [j];
		
		System.out.printf("%d %d", min, max);

	}

}
