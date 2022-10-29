package exe27;

public class Answer {
	static void binInsertSort(int[] a, int n) {
		for (int i=1;i<n;i++) {
			int key = a[i];
			int pl = 0; //�� ��
			int pr = i-1; //�� ��
			int pc; //�߾�
			int pd; //���� ��ġ �ε���
			
			do {
				pc = (pl+pr)/2;
				if(a[pc]==key)
					break;
				else if(a[pc]<key)
					pl = pc+1;
				else
					pr = pc-1;
			}while(pl<=pr);
			
			pd = (pl <= pr) ? pc + 1: pr+1;
			
			for(int j = i; j > pd; j--) {
				a[j]= a[j-1];
			a[pd] = key;
			}
		}
	}
}
