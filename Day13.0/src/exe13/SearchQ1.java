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
		
		System.out.print("��ڼ�");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int ky = stdIn.nextInt();
		int idxhere[] = new int[x.length];
		
		int idx = searchIdx(x, num, ky, idxhere);
		
		if(idx == -1)
			System.out.print("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println("��ġ�ϴ� ��ڰ��� ���� " +idx+"�� �Դϴ�.");
	}
}
