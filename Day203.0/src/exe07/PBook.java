package exe07;

public class PBook extends Book implements Bookface{
	String library;
	
	void setLibrary(String library) {
		this.library = library;
	}
	
	PBook(String name, int page, String library) {
		this.setName(name);
		this.setPage(page);
		this.setLibrary(library);
	}
	
	void showinfo() {
		System.out.println("책 제목: " + this.name);
		System.out.println("페이지 수: " + this.page);
		System.out.println("마지막으로 읽은 페이지: " + this.rpage);
		System.out.println("빌린 도서관: " + this.library);
		System.out.println("---");
	}
}
