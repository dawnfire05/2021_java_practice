package exe07;
import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("����å�� '����', '������ ��', '���� ������'�� �����ּ���");
		PBook p = new PBook(scn.nextLine(),Integer.parseInt(scn.nextLine()),scn.nextLine());
		
		System.out.println("����å�� '����', '������ ��'�� �����ּ���");
		EBook e = new EBook(scn.nextLine(),scn.nextInt());
		
		int n = 0;
		
		while(n>=0) {
			
			System.out.println("[1] å ���� ���� \n[2] ����å ���൵ ������Ʈ \n[3] ����å ���൵ ������Ʈ");
			
			n = scn.nextInt();
			
			if (n == 1) {
				p.showinfo();
				e.showinfo();
				
				System.out.println("[0]�� ���� Ȩ���� ���ư�����");
				scn.nextInt();
			}
			
			else if (n == 2) {
				System.out.print("�󸶳� �����̳���? ");
				p.rpage(scn.nextInt());
				System.out.println("---");
				
				System.out.println("[0] Ȩ");
				scn.nextInt();
			}
			
			else if (n == 3) {
				System.out.print("�󸶳� �����̳���? ");
				e.rpage(scn.nextInt());
				System.out.println("---");
				
				System.out.println("[0] Ȩ");
				scn.nextInt();
			}
			
			else break;
		}
		
/*			static void AllRead(int seledB, Book PBook, Book EBook) {
			String BookName = null;
			int BookPage = 0;
			int pages;
			
			if(seledB == 1) {
				BookName = PBook.name;
				BookPage = PBook.page;
				System.out.println(PBook.name + "��/�� �����ϼ̽��ϴ�.\nå ����: "+ BookName + "\n���� ������ ��: " + PBook.pages+"/" + PBook.page);
			}
			else if(seledB == 2) {
				BookName = EBook.name;
				BookPage = EBook.page;
				System.out.println(PBook.name + "��/�� �����ϼ̽��ϴ�.\nå ����: "+ BookName + "\n���� ������ ��: " + EBook.pages+"/" + EBook.page);
				}
			
			System.out.println("�� ������ �����̽��ϱ�?");
			pages = scn.nextInt();
			
			void 
			Bookface.PageRead(scn.nextInt());
			if (Bookface.returnPageRead()<BookPage) System.out.println(Bookface.returnPageRead() + "/" + BookPage + "\n");
			else if (Bookface.returnPageRead()>=BookPage) System.out.println(BookName + "��/�� �� �о����ϴ�\n");
		} */
		
/*		PBook p1 = new PBook();

		EBook e1 = new EBook();
		
		System.out.println("����å�� '����', '������ ��', 'å�� ���� ������'�� �Է��ϼ���");
		p1.info(scn.nextLine(), scn.nextInt(), scn.nextLine());
		
		scn.nextLine();
		
		System.out.println("����å�� '����', '������ ��'�� �Է��ϼ���");
		e1.info(scn.nextLine(), scn.nextInt());
		
		int n = 0;
		
		while(n>=0) {
			System.out.println("-å�� �����ϼ���-\n[1] " + p1.name + "\n[2] " + e1.name + "\n[3] �����ϱ�");
			n = scn.nextInt();
			if (n>=3) {System.out.println("�����մϴ�"); break;}
			AllRead(n, p1, e1);
		}
		
		scn.close();
		
	} */


	}
}
