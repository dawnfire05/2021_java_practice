package exe01;

import java.util.Scanner;

public class Gauus2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�");
		
		do {
			System.out.print("n�� ��: ");
			n = stdIn.nextInt();
		}while (n<=0);
		
		int sum = 0;
		
		for (int i = 1; i <=n; i++)
			sum += 1;
			
			System.out.println("n���� " + n + "������ ���� " + sum);
		stdIn.close();
	}

}