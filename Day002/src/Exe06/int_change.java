package Exe06;

import java.util.Scanner;

public class int_change {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = scan.next();
		System.out.print("�ּ�: ");
		String address1 = scan.next();
		int address2 = scan.nextInt();
		int address3 = scan.nextInt();
		System.out.print("����: ");
		int age = scan.nextInt();
		System.out.print("������: ");
		//����� ������:�� print �ϴ� ���ɾ� �Դϴ�.
		double weight = scan.nextDouble();
		System.out.println("---------------------");
		
		System.out.println("�̸�: " + name + 
				"\n" + "�ּ�: " + address1 + " " + address2 + "��" + " " + address3 + 
				"\n" + "����: " + age + "��" + 
				"\n" + "������: " + weight + "kg");
			
		scan.close();
		
	}

}