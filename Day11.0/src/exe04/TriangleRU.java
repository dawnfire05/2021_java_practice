package exe04;

import java.util.Scanner;

public class TriangleRU {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("������ ���� ������ �̵ �ﰢ��");
		
		do {
			System.out.print("�� �� �ﰢ���Դϱ�");
			n = stdIn.nextInt();
		}while (n<=0);
		
		for(int i = 1; i<=n; i++) {
			for(int k = 1; k<=i-1; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=n+1-i; j++)
				System.out.print("*");
			System.out.print("\n");
		stdIn.close();
		}

	}

}
