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
		System.out.println("å ����: " + this.name);
		System.out.println("������ ��: " + this.page);
		System.out.println("���������� ���� ������: " + this.rpage);
		System.out.println("���� ������: " + this.library);
		System.out.println("---");
	}
}
