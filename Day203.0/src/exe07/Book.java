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
		System.out.println("책 제목: " + this.name);
		System.out.println("페이지 수: " + this.page);
		System.out.println("마지막으로 읽은 페이지: " + this.rpage);
		System.out.println("---");
	}
	
	void rpage(int rpage) {
		if (rpage<=this.page && rpage>this.rpage) {
			this.rpage = rpage;
			System.out.println(this.page + "페이지 중에서 " + this.rpage + "페이지 읽으셨군요!");
		}
		else System.out.println("잘못된 값을 입력했습니다.");
	}

}
