package exe19;
import java.util.Scanner;

public class RecursiveFunction2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int num;
		int i;
		int result = 1;
		
		System.out.println("정수를 입력하세요 : ");
		num = stdIn.nextInt();
		
		for(i = 1; i<= num; i++)
			result *= i;
	}

}
