package q04673;

public class Main {

	public static void main(String[] args) {
		
		int r = 0;
		
		for(int i = 1; i<=10000; i++) {
			
			for (int j = 10; i>0; j*=10) {
				int p = i%j;
				r = i+p;
				i = i-p;
			}
			
			System.out.println(r);
			
		}

	}

}
