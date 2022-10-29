package Exe17;

import java.util.Scanner;

public class oxquiz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String answers[] = new String[scanner.nextInt()];
		
		
		for (int l = 0; l < answers.length; l++) {
			
			answers[l] = scanner.next();
			
		}
		
		scanner.close();
		
		for (int a = 0; a < answers.length; a++) {
			
			int yeon = 0;
			int jum = 0;
		
			for (int b=0; b < answers[a].length(); b++) {
				if(answers[a].charAt(b) == 'o') {
					yeon ++;
				}
				else
					yeon = 0;
				
				jum += yeon;
			}
			System.out.println(jum);
		}
	}
}