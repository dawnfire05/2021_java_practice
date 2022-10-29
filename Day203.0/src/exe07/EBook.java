package exe07;

public class EBook extends Book implements Bookface{
	
	EBook(String name, int page) {
		this.setName(name);
		this.setPage(page);
	}
}
