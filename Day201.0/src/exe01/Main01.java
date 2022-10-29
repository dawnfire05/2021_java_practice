package exe01;
import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		/*
		if (score>=90&&score<=100)
			System.out.println("A");
		else if (score>=80)
			System.out.println("B");
		else if (score>=70)
			System.out.println("C");
		else if (score>=60)
			System.out.println("D");
		else
			System.out.println("F");
		*/
		
		System.out.print((score>=90)?"A": (score>=80)? "B": (score>=70)? "C": (score>=60)? "D": "F");
		
		scan.close();
	}

}
