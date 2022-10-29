package exe25;

import java.util.Scanner;

public class AlarmClock {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		int time = H*60 + M;
		if (H <= 23 || H>=0  && M >= 0 || M <= 59) {
			if(time - 45 < 0) {
			time -= 45;
			time = 1440 + time;
			H = time / 60;
			M = time % 60;
			System.out.println(H + " " + M);
			}
		
			else {
				time -= 45;
				H = time / 60;
				M = time % 60;
				System.out.println(H + " " + M);
			}
			scan.close();
		}

	}
}
