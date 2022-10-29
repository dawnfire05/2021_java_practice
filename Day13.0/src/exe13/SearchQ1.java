package exe13;
import java.util.Scanner;

public class SearchQ1 {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int i = 0;
//		int idx1[] = null;
		int idxcount = 0;

		while (i < a.length) {
			
			if (i==n)
				return -1;
			
			if(a[i] == key) {
				idx[idxcount] = i;
				idxcount ++;
			}
			i++;
		}
		return idx.length;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		int idxhere[] = new int[x.length];
		
		int idx = searchIdx(x, num, ky, idxhere);
		
		if(idx == -1)
			System.out.print("그 값의 요소가 없습니다.");
		else
			System.out.println("일치하는 요솟값의 수는 " +idx+"개 입니다.");
	}
}
