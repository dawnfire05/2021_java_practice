package Exe07;

import java.util.Scanner;

public class Choice_menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("## �޴� ���� ##");
		System.out.println("[1] ������ [2] �Ǹ���");
		System.out.print("## �޴��� ���� �ϼ���->");
		
		String sel = scan.next();
		
		if(sel.equals("1")) {
			System.out.println("ȯ���մϴ�! �����ڷ� �α����ϼ̽��ϴ�");
		}
		else if(sel.equals("2")){
			System.out.println("ȯ���մϴ�! �Ǹ��ڷ� �α����ϼ̽��ϴ�.");
		}
		else if(sel.equals("3")){
			System.out.println("ȯ���մϴ�! �Ǹ��ڷ� �α����ϼ̽��ϴ�.");
		}
		else if(sel.equals("4")){
			System.out.println("ȯ���մϴ�! �Ǹ��ڷ� �α����ϼ̽��ϴ�.");
		}
		else {
			System.out.println("�˼��մϴ�. ����ڸ� ã�� �� �����ϴ�.");
		}
		scan.close();
	}
}