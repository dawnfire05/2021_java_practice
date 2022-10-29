package exe26;
import java.util.Scanner;

public class P204Q2 {

		static void swap(int arr[], int indx1, int indx2) {
			
			int temp = arr[indx1];
			
			arr[indx1]=arr[indx2];
			
			arr[indx2]=temp;
		}
		
		static void Bubble(int arr[], int n) {
			
			int comp=0;
			int sweep=0;
			
			for(int i=0; i<n-1; i++) {
				System.out.printf("�н� %d: \n", i+1);
				
				for(int j=n-1; j>1; j--) {
					
					for(int m = 0; m<n-1; m++) {
						System.out.printf("%3d %c", arr[m], (m!= j-1)?' ':(arr[j-1]>arr[j])?'+':'-');
						System.out.printf("%3d\n", arr[n-1]);
						
						comp++;
					}
				
					if(arr[j-1]>arr[j]) {
						sweep++;
						swap(arr,j-1,j);
						
					}		

				}
			}
			System.out.println("�񱳸� " + comp + "ȸ �߽��ϴ�.");
			System.out.println("��ȯ�� " + sweep + "ȸ �߽��ϴ�.");
		}
		
		public static void main(String[]args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("<���� ����>");
			System.out.print("��ڼ�: ");
			int nx = scan.nextInt();
			int [] x = new int[nx];
			
			for(int i = 0; i<nx; i++) {
				System.out.print("x["+i+"]: ");
				x[i] = scan.nextInt();
			}
			
			Bubble(x,nx);
			System.out.println("���ĵǾ����ϴ�.");
			
			for(int i = 0; i< nx; i++)
				System.out.println("x[" + i + "]: " + x[i]);
		}
}