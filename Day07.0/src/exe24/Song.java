package exe24;

public class Song {
	String title;
	String artist;
	int year;
	
	public Song(String title, String artist, int year) {
		this.title = title;
		this.artist = artist;
		this.year = year;
	}
	
	public void show() {
		System.out.println(year + "³â ¹ß¸Å" +" / " +title + " / " + artist);

	}
	
	public static void main(String[] args) {
		Song giveme = new Song("Waltz of the flower","lee shin hyuck", 2021);
		giveme.show();
	}
}
