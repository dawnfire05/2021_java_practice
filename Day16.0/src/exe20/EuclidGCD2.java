package exe20;
import java.util.Scanner;

public class EuclidGCD2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		int buf = 0;
		
		while(x%y!=0) {
			buf =  x % y;
			x = y;
			y = buf;
			
		}
		
		System.out.println(y);
	}

}
