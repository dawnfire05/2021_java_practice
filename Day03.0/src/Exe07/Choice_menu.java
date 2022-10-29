package Exe07;

import java.util.Scanner;

public class Choice_menu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("## 메뉴 선택 ##");
		System.out.println("[1] 구매자 [2] 판매자");
		System.out.print("## 메뉴를 선택 하세요->");
		
		String sel = scan.next();
		
		if(sel.equals("1")) {
			System.out.println("환영합니다! 구매자로 로그인하셨습니다");
		}
		else if(sel.equals("2")){
			System.out.println("환영합니다! 판매자로 로그인하셨습니다.");
		}
		else if(sel.equals("3")){
			System.out.println("환영합니다! 판매자로 로그인하셨습니다.");
		}
		else if(sel.equals("4")){
			System.out.println("환영합니다! 판매자로 로그인하셨습니다.");
		}
		else {
			System.out.println("죄송합니다. 사용자를 찾을 수 없습니다.");
		}
		scan.close();
	}
}