package exe07;

abstract class Book implements Bookface{
	
	String name;
	int page;
	int rpage;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setPage(int page) {
		this.page = page;
	}
	
	void showinfo() {
		System.out.println("å ����: " + this.name);
		System.out.println("������ ��: " + this.page);
		System.out.println("���������� ���� ������: " + this.rpage);
		System.out.println("---");
	}
	
	void rpage(int rpage) {
		if (rpage<=this.page && rpage>this.rpage) {
			this.rpage = rpage;
			System.out.println(this.page + "������ �߿��� " + this.rpage + "������ �����̱���!");
		}
		else System.out.println("�߸��� ���� �Է��߽��ϴ�.");
	}

}
