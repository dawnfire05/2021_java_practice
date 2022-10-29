package exe03;

public class Plus {

	public static void main(String[] args) {
		int garo=0;
		int sero=0;
		
		System.out.print("  |");
		for(int i = 1;i<=9;i++) {
			System.out.printf("%3d", i);
		}
		System.out.println("\n--+---------------------------");
		
		do {
			sero++;
			System.out.print(sero + " |");
			do {
				garo++;
				System.out.printf("%3d", garo + sero);
			}while(garo<=8);
			garo = 0;
			System.out.println();
		}while(sero<=8);
	}

}
