package Exe08;

import java.util.Scanner;

public class Test_login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("## ���̵� �Է��ϼ���: ");
		
		String uname = scan.next();
		
		if(uname.equals("dawnfire05")) {
			System.out.print("��й�ȣ�� �Է��ϼ���: ");
			
			String pwd = scan.next();
			if(pwd.equals("1234")) {
				System.out.println("��й�ȣ ���� Ȯ��!! -> �α��� ����");
			}
			else
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.!!");
		}
		else
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.!!");
		scan.close();
	}
}