package Exe15;

import java.util.Scanner;

public class BigSmall {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.print("<�ִ�, �ּ� ���ϱ�> \n�迭�� ���̸� �����ּ���\n-->");
		int howlong = Scan.nextInt();
		int pocket[] = new int[howlong];
		
		System.out.print("���� "+howlong+"���� �Է��� �ּ���\n");
		for(int a=0; a<pocket.length; a++) {
			System.out.print("-->");
			int num = Scan.nextInt();
				pocket[a] = num;
		}
		int  min = pocket[0];
		int  max = pocket[0];
		for(int i=0; i<pocket.length; i++) {
			if(min > pocket[i]){
				min = pocket[i];
			}
			if(max < pocket[i]){
				max = pocket[i];
			}
		}	
		System.out.println("�ּڰ�: " + min);
		System.out.print("�ִ�: " + max);
	Scan.close();
	}
}