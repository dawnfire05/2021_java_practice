package exe07;
import java.util.Scanner;

public class Main {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("종이책의 '제목', '페이지 수', '빌린 도서관'을 적어주세요");
		PBook p = new PBook(scn.nextLine(),Integer.parseInt(scn.nextLine()),scn.nextLine());
		
		System.out.println("전자책의 '제목', '페이지 수'를 적어주세요");
		EBook e = new EBook(scn.nextLine(),scn.nextInt());
		
		int n = 0;
		
		while(n>=0) {
			
			System.out.println("[1] 책 정보 보기 \n[2] 종이책 진행도 업데이트 \n[3] 전자책 진행도 업데이트");
			
			n = scn.nextInt();
			
			if (n == 1) {
				p.showinfo();
				e.showinfo();
				
				System.out.println("[0]을 눌러 홈으로 돌아가세요");
				scn.nextInt();
			}
			
			else if (n == 2) {
				System.out.print("얼마나 읽으셨나요? ");
				p.rpage(scn.nextInt());
				System.out.println("---");
				
				System.out.println("[0] 홈");
				scn.nextInt();
			}
			
			else if (n == 3) {
				System.out.print("얼마나 읽으셨나요? ");
				e.rpage(scn.nextInt());
				System.out.println("---");
				
				System.out.println("[0] 홈");
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
				System.out.println(PBook.name + "을/를 선택하셨습니다.\n책 제목: "+ BookName + "\n읽은 페이지 수: " + PBook.pages+"/" + PBook.page);
			}
			else if(seledB == 2) {
				BookName = EBook.name;
				BookPage = EBook.page;
				System.out.println(PBook.name + "을/를 선택하셨습니다.\n책 제목: "+ BookName + "\n읽은 페이지 수: " + EBook.pages+"/" + EBook.page);
				}
			
			System.out.println("몇 페이지 읽으셨습니까?");
			pages = scn.nextInt();
			
			void 
			Bookface.PageRead(scn.nextInt());
			if (Bookface.returnPageRead()<BookPage) System.out.println(Bookface.returnPageRead() + "/" + BookPage + "\n");
			else if (Bookface.returnPageRead()>=BookPage) System.out.println(BookName + "을/를 다 읽었습니다\n");
		} */
		
/*		PBook p1 = new PBook();

		EBook e1 = new EBook();
		
		System.out.println("종이책의 '제목', '페이지 수', '책을 빌린 도서관'을 입력하세요");
		p1.info(scn.nextLine(), scn.nextInt(), scn.nextLine());
		
		scn.nextLine();
		
		System.out.println("전자책의 '제목', '페이지 수'를 입력하세요");
		e1.info(scn.nextLine(), scn.nextInt());
		
		int n = 0;
		
		while(n>=0) {
			System.out.println("-책을 선택하세요-\n[1] " + p1.name + "\n[2] " + e1.name + "\n[3] 종료하기");
			n = scn.nextInt();
			if (n>=3) {System.out.println("종료합니다"); break;}
			AllRead(n, p1, e1);
		}
		
		scn.close();
		
	} */


	}
}
